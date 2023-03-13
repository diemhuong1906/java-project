package HUONG7;

public class Truck extends Vehicle {
    private int weightCapacity;
    
    public Truck(String licensePlateNumber, String manufacturer, int yearOfManufacture, String color, Owner owner, int weightCapacity) {
        super(licensePlateNumber, manufacturer, yearOfManufacture, color, owner);
        this.weightCapacity = weightCapacity;
    }
    
    // getter and setter
    public int getWeightCapacity() {
        return weightCapacity;
    }
    
    public void setWeightCapacity(int weightCapacity) {
        this.weightCapacity = weightCapacity;
    }
}
