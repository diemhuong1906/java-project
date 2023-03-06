package HUONG4;

public class PassengerCar extends Vehicle {
    private int numberOfSeats;
    private double specialConsumptionTax;
    
    public PassengerCar(String id, String name, double rentalPrice, int numberOfSeats) {
        super(id, name, rentalPrice, 10, 20);
        this.numberOfSeats = numberOfSeats;
        if (numberOfSeats >= 5) {
        	specialConsumptionTax = 30;
        }
        else {
        	specialConsumptionTax = 50;
        }
    }
    
    @Override
    public double calculateRentalCost() {
        double rentalCost = super.calculateRentalCost();
        return rentalCost + (super.getRentalPrice() * specialConsumptionTax / 100);
    }

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public double getSpecialConsumptionTax() {
		return specialConsumptionTax;
	}

	public void setSpecialConsumptionTax(double specialConsumptionTax) {
		this.specialConsumptionTax = specialConsumptionTax;
	}
}