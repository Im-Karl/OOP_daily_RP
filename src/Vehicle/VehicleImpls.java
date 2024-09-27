package Vehicle;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class VehicleImpls implements ListVehicle<Vehicle>{
	List<Vehicle> list;
	public VehicleImpls() {
		list = new LinkedList<Vehicle>();
	}
	public VehicleImpls(List<Vehicle> list) {
		this.list = list;
	}
	@Override
	public void addVehicle(Vehicle v) {
	    boolean exists = false;
	    for (Vehicle vehicle : list) {
	        if (vehicle.getId() == v.getId()) {
	            exists = true;
	            System.out.println("Can't add because has"
	            		+ " contain this id in list");
	            break;
	        }
	    }
	    if (!exists) {
	        list.add(v);
	        System.out.println("Add successful!!");
	    }
	}
	
	
	@Override
	public Vehicle searchVehicle(Integer id) {
		for(Vehicle v : list) {
			if(v.getId().equals(id)) {
				return v; 
			}
		}
		return null;
	}

	@Override
	public void removeVehicle(Integer id) {
		for(Vehicle v : list) {
			if(v.getId().equals(id)) {
				list.remove(v);
				System.out.println("Delete successful");
			}else {
				System.out.println("Not containt this id in list");
			}
		}
	}

	@Override
	public void sortVehicleWithID() {
		list.sort((r1,r2)-> (r1.getId().compareTo(r2.getId())));
	}

	@Override
	public void sortVehicleWithPrice() {
		list.sort((r1,r2)-> (r1.getPrice().compareTo(r2.getPrice())));
	}

	@Override
	public List<Vehicle> displayVehicle() {
	    if (list.isEmpty()) {
	        System.out.println("List is empty!");
	    } else {
	        System.out.printf("%-5s %-20s %-15s %-10s %-15s %-10s%n", "ID", "Brand", "Type",  "Speed (Km/h)", "Price (Dong)", "Details");
	        System.out.println("-------------------------------------------------------------------------------");
	        for (Vehicle v : list) {
	            System.out.printf("%-5d %-20s %-15s %-15d %-13d %s%n", 
	                v.getId(), v.getBrand(), v.getType(), v.getSpeed(), v.getPrice(), v.toString());
	        }
	    }
	    return list;
	}

	@Override
	public void updateVehicle(Vehicle vehicle, Integer id) {
		for(Vehicle v : list) {
			if(v.getId().equals(id)) {
				v = vehicle;
				return;
			}
		}
	}

	@Override
	public List<Vehicle> listqualified() {
		List<Vehicle> s = new LinkedList<Vehicle>();
		for(Vehicle v: list) {
			if(v.qualified()) {
				s.add(v);
			}
		}
		return  s;
	}

	@Override
	public Integer size() {
		return list.size();
	}

	@Override
	public void clearAll() {
		list.clear();
	}
	public List<Vehicle> searchVehicle(String type) {
	    List<Vehicle> newlist = new LinkedList<>();
	    
	    if (list.isEmpty()) {
	        System.out.println(" ");
	        return newlist; 
	    }
	    for (Vehicle v : list) {
	        if (v.getType().equalsIgnoreCase(type)) {
	            newlist.add(v);
	        }
	    }
	    return newlist; 
	}

	public List<Vehicle> searchVehicle(BigInteger min, BigInteger max) {
	    List<Vehicle> newlist = new LinkedList<>();
	    if (list.isEmpty()) {
	        System.out.println(" ");
	        return newlist; 
	    }
	    for (Vehicle v : list) {
	    	BigInteger price = v.getPrice();
	        if (price.compareTo(min) >= 0 && price.compareTo(max) <= 0) {
	            newlist.add(v);
	        }
	    }
	    return newlist; 
	}
}
