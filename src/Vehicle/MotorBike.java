package Vehicle;

public class MotorBike  extends Vehicle{
	protected String fuel;

	public MotorBike(Integer id, String brand, String type, Integer speed, Integer price, String fuel) {
		super(id, brand, type, speed, price);
		this.fuel = fuel;
	}

	public MotorBike() {
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "MotorBike [id=" + id + ", brand=" + brand + ", type=" + type + ", speed=" + speed
				+ ", price=" + price +", fuel=" + fuel + "]";
	}
	
}
