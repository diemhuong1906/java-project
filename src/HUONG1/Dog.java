package HUONG1;

public class Dog extends Animal {
    private String color;
    private double weight;

    public Dog(String name, int age, String breed, String color, double weight) {
        super(name, age, breed);
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}