package customer_tracking;

import java.util.Objects;

public abstract class Room {
	protected String code;
	protected Integer path;
	protected Double area;
	protected Integer lightCount;
	
	
	
	public Room() {
		super();
	}
	public Room(String code, Integer path, Double area, Integer lightCount) {
		super();
		this.code = code;
		this.path = path;
		this.area = area;
		this.lightCount = lightCount;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getPath() {
		return path;
	}
	public void setPath(Integer path) {
		this.path = path;
	}
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	public Integer getLightCount() {
		return lightCount;
	}
	
	public void setLightCount(Integer lightCount) {
		this.lightCount = lightCount;
	}
	@Override
	public String toString() {
		return "Room [code=" + code + ", path=" + path + ", area=" + area + ", lightCount=" + lightCount + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(code);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		return Objects.equals(code, other.code);
	}
	
	public abstract boolean Qualified();
	

	
	
}
