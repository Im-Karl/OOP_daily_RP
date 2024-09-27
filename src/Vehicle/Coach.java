package Vehicle;

import java.math.BigInteger;

public class Coach extends Vehicle{
	protected Integer seat;
	protected String fuel, station;
	public Coach(Integer id, String brand, String type, Integer speed, BigInteger price, Integer seat,String station, String fuel
			) {
		super(id, brand, type, speed, price);
		this.seat = seat;
		this.fuel = fuel;
		this.station = station;
	}
	public Coach() {
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
	public String getStation() {
		return station;
	}
	public void setStation(String station) {
		this.station = station;
	}
	@Override
	public String toString() {
		return "Coach [id=" + id + ", brand=" + brand
				+ ", type=" + type + ", speed=" + speed + ", price=" + price + ", seat=" + seat + ", station=" + station +", fuel=" + fuel +"]";
	}
	public boolean qualified() {
		return seat>30 || speed >60 ;
	}
}
