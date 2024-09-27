package Vehicle;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PriceList {
    private List<BigInteger> pricelist;

    public PriceList() {
    	pricelist = new ArrayList<>();
    }

    public void addPrice(BigInteger price) {
    	pricelist.add(price);
    }
    
    public void removePrice(BigInteger price) {
    	pricelist.remove(price);
    }
    
    public List<BigInteger> getPrices() {
        return pricelist;
    }

    public void displayPrices() {
        if (pricelist.isEmpty()) {
            System.out.println("Danh sách giá trống.");
        } else {
            System.out.println("Danh sách giá niêm yết:");
            for (BigInteger price : pricelist) {
                System.out.println(price);
            }
        }
    }
}