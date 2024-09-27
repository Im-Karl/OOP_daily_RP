package Vehicle;

import java.util.ArrayList;
import java.util.List;

public class FuelList {
	private List<String> fuellist;
	
	public FuelList() {
		fuellist = new ArrayList<String>();
	}
	public void addFuel(String fuel) {
		fuellist.add(fuel);
	}
	public void removeFuel(String fuel) {
		fuellist.remove(fuel);
	}
	public List<String> getFuelList(){
		return fuellist;
	}
	public void displayFuel() {
		if(fuellist.isEmpty()) {
			System.out.println("Danh sách nhiên liệu trống");
		}else {
			System.out.println("Danh sách nhiên liệu:");
			for(String fuel : fuellist) {
				System.out.println(fuel);
			}
		}
	}
}
