package Vehicle;

import java.math.BigInteger;

public class MotorBike  extends Vehicle{
	protected String fuel;

	public MotorBike(Integer id, String brand, String type, Integer speed, BigInteger price,String colour, String fuel) {
		super(id, brand, type, speed, price, colour);
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
		return "MotorBike [fuel=" + fuel + "]";
	}
	public boolean qualified() {
		return speed > 150 ;
	}
}
