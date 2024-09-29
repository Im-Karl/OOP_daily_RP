package Vehicle;

import java.math.BigInteger;

public class BikeCycle extends Vehicle{
	protected String tyre;

	public BikeCycle(Integer id, String brand, String type, Integer speed, BigInteger price,String colour, String tyre) {
		super(id, brand, type, speed, price, colour);
		this.tyre = tyre;
	}

	public BikeCycle() {
	}

	public String getTyre() {
		return tyre;
	}

	public void setTyre(String tyre) {
		this.tyre = tyre;
	}
	public void afterToString() {
		System.out.println("");
	}
	@Override
	public String toString() {
		return "BikeCycle [tyre=" + tyre   + "]";
	}
	public boolean qualified() {
		return true ;
	}
}
