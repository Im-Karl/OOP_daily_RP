package Vehicle;

import java.math.BigInteger;

public class Truck extends Vehicle{
	protected Integer weight;
	protected String fuel;

	public Truck(Integer id, String brand, String type, Integer speed, BigInteger price,String colour, Integer weight, String fuel) {
		super(id, brand, type, speed, price, colour);
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
		return "Truck [fuel"+ fuel+ ", weight=" + weight +  "]";
	}
	public boolean qualified() {
		return weight > 2500 ;
	}
}
