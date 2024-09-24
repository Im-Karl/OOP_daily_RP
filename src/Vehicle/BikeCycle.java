package Vehicle;

public class BikeCycle extends Vehicle{
	protected String tyre;

	public BikeCycle(Integer id, String brand, String type, Integer speed, Integer price, String tyre) {
		super(id, brand, type, speed, price);
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

	@Override
	public String toString() {
		return "BikeCycle [id=" + id + ", brand=" + brand + ", type=" + type
				+ ", speed=" + speed + ", price=" + price+ ", tyre=" + tyre   + "]";
	}
	
}
