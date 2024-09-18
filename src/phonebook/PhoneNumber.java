package phonebook;

import java.util.Objects;

public  class PhoneNumber {
	protected String name,number, address;

	public PhoneNumber(String name, String number, String address) {
		this.number = number;
		this.name = name;
		this.address = address;
	}
	
	public PhoneNumber() {
		super();
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneNumber other = (PhoneNumber) obj;
		return Objects.equals(number, other.number);
	}

	@Override
	public String toString() {
		return "PhoneNumber [name=" + name + ", number=" + number + ", address=" + address + "]";
	}
	
}
