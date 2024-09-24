package Vehicle;

public class Car extends Vehicle{
	protected Integer seat;
	protected String fuel;
	public Car(Integer id, String brand, String type, Integer speed, Integer price, Integer seat, String fuel) {
		super(id, brand, type, speed, price);
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
		return "Car [id=" + id + ", brand=" + brand + ", type=" + type
				+ ", speed=" + speed + ", price=" + price + "seat=" + seat +  ", fuel=" + fuel+ "]";
	}
	
 }
