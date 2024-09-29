package Vehicle;

import java.math.BigInteger;

public class Car extends Vehicle{
	protected Integer seat;
	protected String fuel;
	public Car(Integer id, String brand, String type, Integer speed, BigInteger price,String colour, Integer seat, String fuel) {
		super(id, brand, type, speed, price, colour);
		this.seat = seat;
		this.fuel = fuel;
	}
	public Car() {
	}
	public Integer getSeat() {
		return seat;
	}
	public void setSeat(Integer seat) {
		this.seat = seat;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	@Override
	public String toString() {
		return "Car [seat=" + seat +  ", fuel=" + fuel+ "]";
	}
	public boolean qualified() {
		return seat > 4 ;
	}
 }
