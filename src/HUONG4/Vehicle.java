package HUONG4;

public class Vehicle {
    private String id;
    private String name;
    private double rentalPrice;
    private double vat;
    private double registrationTax;
    
    public Vehicle(String id, String name, double rentalPrice, double vat, double registrationTax) {
        this.id = id;
        this.name = name;
        this.rentalPrice = rentalPrice;
        this.vat = vat;
        this.registrationTax = registrationTax;
    }

	public double calculateRentalCost() {
        double tax = (rentalPrice * vat / 100) + (rentalPrice * registrationTax / 100);
        return rentalPrice + tax;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRentalPrice() {
		return rentalPrice;
	}

	public void setRentalPrice(double rentalPrice) {
		this.rentalPrice = rentalPrice;
	}

	public double getVat() {
		return vat;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}

	public double getRegistrationTax() {
		return registrationTax;
	}

	public void setRegistrationTax(double registrationTax) {
		this.registrationTax = registrationTax;
	}
}
