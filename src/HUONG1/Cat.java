package HUONG1;

public class Cat extends Animal {
    private String furColor;
    private double height;

    public Cat(String name, int age, String breed, String furColor, double height) {
        super(name, age, breed);
        this.furColor = furColor;
        this.height = height;
    }

    public String getFurColor() {
        return furColor;
    }

    public double getHeight() {
        return height;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}