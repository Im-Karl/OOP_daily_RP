package Vehicle;

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
		if(list.isEmpty()) {
			System.out.println("List is empty!");
		}else {
			for(Vehicle v : list) {
				System.out.println(v.toString());
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
	public List<Vehicle> qualified() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer size() {
		return list.size();
	}

	@Override
	public void clearAll() {
		list.clear();
	}

}
