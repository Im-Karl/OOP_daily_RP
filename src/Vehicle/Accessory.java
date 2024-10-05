package Vehicle;

import java.util.Objects;

public abstract class Accessory {
	protected String accessory;
	protected Integer num;
	public Accessory(String accessory, Integer num) {
		this.accessory = accessory;
		this.num = num;
	}
	public Accessory() {
	}
	public String getAccessory() {
		return accessory;
	}
	public void setAccessory(String accessory) {
		this.accessory = accessory;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	@Override
	public int hashCode() {
		return Objects.hash(accessory);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Accessory other = (Accessory) obj;
		return Objects.equals(accessory, other.accessory);
	}
	@Override
	public String toString() {
		System.out.printf("%-20s %-12s","Phụ kiện", "Số lượng (cái)");
	    return String.format("%-20s %-12s",  accessory, num);
	}
	
}
