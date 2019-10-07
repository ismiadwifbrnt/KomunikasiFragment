package id.ac.polinema.idealbodyweight.util;

public class BodyMassIndex {
    private float height;
    private int weight;
    private String index;

    public BodyMassIndex(float height, int weight) {
        this.height = height;
        this.weight = weight;
        this.index = calculate();
    }

    public String getIndex() {
        return index;
    }

    private String calculate() {
        float result = weight / (height * height);
        if (result < 18.5) {
            return "Underweight";
        } else if (result > 18.5 && result < 24.99) {
            return "Healthy";
        } else if (result > 25) {
            return "Overweight";
        }
        return "Error";
    }
}