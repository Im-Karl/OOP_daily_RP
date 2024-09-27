package Vehicle;

import java.math.BigInteger;
import java.util.List;

public class StationList {
	private List<String> stationlist;
	
	public void addStation(String station) {
		stationlist.add(station);
	}
	public void removeStation(String station) {
		stationlist.remove(station);
	}
	public List<String> getStationList(){
		return stationlist;
	}
	public void displayStation() {
		if(stationlist.isEmpty()) {
			System.out.println("Danh sách giá trống.");
		}else {
			System.out.println("Danh sách trạm niêm yết:");
            for (String station : stationlist) {
                System.out.println(station);
            }
		}
	}
}
