package HUONG7;

public class Vehicle implements Comparable<Vehicle> {
    private String licensePlateNumber;
    private String manufacturer;
    private int yearOfManufacture;
    private String color;
    private Owner owner;
    
    public Vehicle(String licensePlateNumber, String manufacturer, int yearOfManufacture, String color, Owner owner) {
        this.licensePlateNumber = licensePlateNumber;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.owner = owner;
    }
    
    // getters and setters
    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }
    
    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
    
    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public Owner getOwner() {
        return owner;
    }
    
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    
    @Override
    public int compareTo(Vehicle otherVehicle) {
        return this.getLicensePlateNumber().compareTo(otherVehicle.getLicensePlateNumber());
    }
}