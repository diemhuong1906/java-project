package HUONG7;

import java.util.List;

public class main {

	public static void main(String[] args) {
	    Manager manager = new Manager();

	    // Thêm phương tiện giao thông
	    manager.addVehicle(new Car("11111", "Yamaha", 2005, "Red", new Owner("234567890123", "AAA", "aaa@example.com"), 5, "Gas"));
	    manager.addVehicle(new Car("54362", "Suzuki", 2010, "Black", new Owner("345678901234", "BBB", "bbb@example.com"), 5, "Gas"));
	    manager.addVehicle(new Car("13571", "Honda", 2015, "White", new Owner("456789012345", "CCC", "ccc@example.com"), 5, "Gas"));
	    manager.addVehicle(new Car("75432", "Toyota", 2019, "Gray", new Owner("567890123456", "DDD", "ddd@example.com"), 5, "Gas"));
	    manager.addVehicle(new Car("43621", "Honda", 2008, "Silver", new Owner("234567890123", "AAA", "aaa@example.com"), 5, "Gas"));
	    manager.addVehicle(new Motorbike("07471", "Suzuki", 2005, "Red", new Owner("234567890123", "AAA", "aaa@example.com"), 150));
	    manager.addVehicle(new Motorbike("25618", "Honda", 2010, "Black", new Owner("345678901234", "BBB", "bbb@example.com"), 100));
	    manager.addVehicle(new Motorbike("67923", "Yamaha", 2015, "White", new Owner("456789012345", "CCC", "ccc@example.com"), 50));
	    manager.addVehicle(new Motorbike("98422", "Toyota", 2019, "Gray", new Owner("234567890123", "AAA", "aaa@example.com"), 170));
	    manager.addVehicle(new Motorbike("22415", "Honda", 2008, "Silver", new Owner("567890123456", "DDD", "ddd@example.com"), 200));
	    manager.addVehicle(new Truck("85742", "Toyota", 2012, "Blue", new Owner("234567890123", "AAA", "aaa@example.com"), 8000));
	    manager.addVehicle(new Truck("47287", "Suzuki", 2008, "Red", new Owner("345678901234", "BBB", "bbb@example.com"), 5000));
	    manager.addVehicle(new Truck("63347", "Toyota", 2019, "White", new Owner("567890123456", "DDD", "ddd@example.com"), 12000));
	    manager.addVehicle(new Truck("14582", "Honda", 2015, "Black", new Owner("234567890123", "AAA", "aaa@example.com"), 6000));
	    manager.addVehicle(new Truck("52752", "Toyota", 2010, "Gray", new Owner("234567890123", "AAA", "aaa@example.com"), 10000));

	    Vehicle vehicle1 = manager.findVehicleByLicensePlateNumber("98422");
	    System.out.println("2 - Vehicle found by number: " + vehicle1.getLicensePlateNumber());
	    System.out.println("---------------------------");

	    List<Vehicle> vehicles1 = manager.findVehiclesByOwnerId("234567890123");
	    System.out.println("3 - Vehicles found by owner ID: " + vehicles1.size());
	    System.out.println("---------------------------");
	    
	    System.out.println("4 - Before delete: " + manager.getVehicles().size());
	    manager.deleteVehicleByManufacturer("Toyota");
	    System.out.println("4 - After delete: " + manager.getVehicles().size());
	    System.out.println("---------------------------");
	    System.out.println("5 - Manufacturer has the most vehicles under management: " + manager.getMaxManufacturer());
	    System.out.println("---------------------------");
	    manager.sortVehicleByLicensePlateNumber();
	    System.out.println("---------------------------");
	    manager.statisticsVehicle();
	}
}
