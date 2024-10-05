package Vehicle;

import java.util.Objects;

public class CustomerBuyAccessories extends Customer{
    private String accessory;
    protected Integer num;
    
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
	
	
	
	
	
	

	public CustomerBuyAccessories(Integer idCustomer, String name, Integer idVehicle, String diaChi, String accessory,
			Integer num) {
		super(idCustomer, name, idVehicle, diaChi);
		this.accessory = accessory;
		this.num = num;
	}

	public CustomerBuyAccessories() {
	}

	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(accessory);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerBuyAccessories other = (CustomerBuyAccessories) obj;
		return Objects.equals(accessory, other.accessory);
	}

	@Override
	public String toString() {
		return "CustomerBuyAccessories [idCustomer=" + idCustomer
				+ ", name=" + name +", accessory=" + accessory + ", num=" + num  + "]";
	}

	
    
}