package Vehicle;

import java.math.BigInteger;

public class Truck extends Vehicle{
	protected Integer weight;
	protected String fuel;

	public Truck(Integer id, String brand, String type, Integer speed, BigInteger price, Integer weight, String fuel) {
		super(id, brand, type, speed, price);
		this.weight = weight;
		this.fuel = fuel;
	}

	public Truck() {
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "Truck [id=" + id + ", brand=" + brand + ", type=" + type + ", speed=" + speed
				+ ", price=" + price +", weight=" + weight + ", fuel="+ fuel+ "]";
	}
	public boolean qualified() {
		return weight > 2500 ;
	}
}
