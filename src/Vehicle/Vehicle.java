package Vehicle;
import java.math.BigInteger;
import java.util.Objects;

public abstract class Vehicle {
	protected Integer id;
	protected String brand, type;
	protected Integer speed;
	protected BigInteger price;
	public Vehicle(Integer id, String brand, String type,Integer speed, BigInteger price) {
		this.id = id;
		this.brand = brand;
		this.type = type;
		this.speed = speed;
		this.price = price;
	}
	public Vehicle() {
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public BigInteger getPrice() {
		return price;
	}
	public void setPrice(BigInteger price) {
		this.price = price;
	}
	
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", brand=" + brand + ", type=" + type +  ", price=" + price
				+ "]";
	}
	protected abstract boolean qualified();
	
}
