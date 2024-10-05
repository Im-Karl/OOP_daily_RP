package Vehicle;

import java.util.Objects;

public abstract class Customer {
	protected Integer idCustomer,idVehicle;
	protected String  name ,diaChi;

	public Customer(Integer idCustomer, String name, Integer idVehicle, String diaChi) {
		this.idCustomer = idCustomer;
		this.name = name;
		this.idVehicle = idVehicle;
		this.diaChi = diaChi;
	}

	public Customer() {
	}

	public Integer getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(Integer idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIdVehicle() {
		return idVehicle;
	}

	public void setIdVehicle(Integer idVehicle) {
		this.idVehicle = idVehicle;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCustomer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(idCustomer, other.idCustomer);
	}

	@Override
	public String toString() {
		return "Customer [idCustomer=" + idCustomer + ", name=" + name + ", idVehicle=" + idVehicle + ", diaChi="
				+ diaChi + "]";
	}
	
}
