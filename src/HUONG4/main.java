package HUONG4;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle bicycle = new Bicycle("B001", "Bicycle", 2000);
        System.out.println("Bicycle rental cost: " + bicycle.calculateRentalCost());
        
        Vehicle motorbike = new Motorbike("M001", "Motorbike", 5000);
        System.out.println("Motorbike rental cost: " + motorbike.calculateRentalCost());
        
        Vehicle truck = new Truck("T001", "Truck", 10000);
        System.out.println("Truck rental cost: " + truck.calculateRentalCost());
        
        Vehicle passengerCar1 = new PassengerCar("PC001", "Passenger Car 1", 20000, 4);
        System.out.println("Passenger car 1 rental cost: " + passengerCar1.calculateRentalCost());
        
        Vehicle passengerCar2 = new PassengerCar("PC002", "Passenger Car 2", 30000, 10);
        System.out.println("Passenger car 2 rental cost: " + passengerCar2.calculateRentalCost());
	}

}
