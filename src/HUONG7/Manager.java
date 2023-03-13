package HUONG7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Manager {
    private List<Vehicle> vehicles;
    
    public Manager() {
        this.vehicles = new ArrayList<>();
    }
    
    public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	// 1 - Thêm phương tiện giao thông
    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }
    
    // 2 - Tìm kiếm phương tiện giao thông theo số xe
    public Vehicle findVehicleByLicensePlateNumber(String licensePlateNumber) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getLicensePlateNumber() == licensePlateNumber) {
                return vehicle;
            }
        }
        return null;
    }
    
    // 3 - Tìm phương tiện giao thông của chủ xe có số cmnd tương ứng.
    public List<Vehicle> findVehiclesByOwnerId(String ownerId) {
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getOwner().getIdNumber().equals(ownerId)) {
                result.add(vehicle);
            }
        }
        return result;
    }
    
    // 4 - Xóa tất cả các phương tiện giao thông của một nhà sản xuất bất kỳ.
    public void deleteVehicleByManufacturer(String manufacturer) {
    	for (int i = 0; i < vehicles.size(); i++) {
    		if (vehicles.get(i).getManufacturer().equals(manufacturer)) {
    			vehicles.remove(i);
    		}
    	}
    }
    
    // 5 - Cho biết nhà sản xuất nào có nhiều xe nhất đang được quản lý
    public String getMaxManufacturer() {
    	HashMap<String, Integer> manufacturers = new HashMap<String, Integer>();
    	for (Vehicle vehicle : vehicles) {
    		String manufacturer = vehicle.getManufacturer();
    		int count = manufacturers.getOrDefault(manufacturer, 0);
    		manufacturers.put(manufacturer, count + 1);
    	}
    	int maxCount = 0;
        String maxManufacturer = null;
    	for (String manufacturer : manufacturers.keySet()) {
		  if (manufacturers.get(manufacturer) > maxCount) {
              maxCount = manufacturers.get(manufacturer);
              maxManufacturer = manufacturer;
          }
		}
    	return maxManufacturer + " with " + maxCount + " vehicles";
    }
    
    // 6 - Sắp xếp các phương tiện giao thông theo số xe giảm dần
    public void sortVehicleByLicensePlateNumber() {
        Collections.sort(vehicles);
        Collections.reverse(vehicles);
        System.out.println("6 - Sort the transportation vehicles in descending order by the number of cars.");
        for (Vehicle vehicle : vehicles) {
        	System.out.println(vehicle.getLicensePlateNumber());
    	}
    }
    
    // 7 - Thống kê mỗi loại phương tiện có bao nhiêu xe đang được quản lý.
    public void statisticsVehicle() {
    	HashMap<String, Integer> statisticsVehicle = new HashMap<String, Integer>();
    	for (Vehicle vehicle : vehicles) {
    		String type = vehicle.getClass().getSimpleName();
    		int count = statisticsVehicle.getOrDefault(type, 0);
    		statisticsVehicle.put(type, count + 1);
    	}
    	System.out.println("7 - Count the number of vehicles of each type that are currently being managed:");
    	for (String type : statisticsVehicle.keySet()) {
		  System.out.println(type + " - " + statisticsVehicle.get(type));
		}
    }
}
