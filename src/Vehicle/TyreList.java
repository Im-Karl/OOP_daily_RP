package Vehicle;

import java.util.List;

public class TyreList {
	private List<String> tyrelist;
	public void addTyre(String tyre) {
		tyrelist.add(tyre);
	}
	public void removeTyre(String tyre) {
		tyrelist.remove(tyre);
	}
	public List<String> getTyreList(){
		return tyrelist;
	}
	public void displayTyre() {
		if(tyrelist.isEmpty()) {
			System.out.println("Danh sách lốp trông!!");
		}else {
			System.out.println("Danh sách lốp niêm yết:");
			for(String tyre : tyrelist) {
				System.out.println(tyre);
			}
		}
	}
}
