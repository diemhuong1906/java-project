package HUONG7;

public class Motorbike extends Vehicle {
    private int horsepower;
    
    public Motorbike(String licensePlateNumber, String manufacturer, int yearOfManufacture, String color, Owner owner, int horsepower) {
        super(licensePlateNumber, manufacturer, yearOfManufacture, color, owner);
        this.horsepower = horsepower;
    }
    
    public int getHorsepower() {
        return horsepower;
    }
    
    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}