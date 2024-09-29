package Vehicle;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class BrandList {
	private List<String> brandlist;
	public BrandList() {
		brandlist = new ArrayList<String>();
	}
	
	public void addBrand(String brand) {
		brandlist.add(brand);
	}
	public void removeBrand(String brand) {
		brandlist.remove(brand);
	}
	public List<String> getBrandList(){
		return brandlist;
	}
	public void displayBrand() {
		if(brandlist.isEmpty()) {
			System.out.println("Danh sách hãng trống.");
		}else {
			System.out.println("Danh sách hãng niêm yết:");
            for (String brand : brandlist) {
                System.out.println(brand);
            }
		}
	}
}
