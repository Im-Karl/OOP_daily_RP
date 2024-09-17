package customer_tracking;

public class ComputerRoom extends Room{
	private Integer computerCount;

	public ComputerRoom(String code, Integer path, Double area, Integer lightCount, Integer computerCount) {
		super(code, path, area, lightCount);
		this.computerCount = computerCount;
	}

	public ComputerRoom() {
		super();
	}

	public Integer getComputerCount() {
		return computerCount;
	}

	public void setComputerCount(Integer computerCount) {
		this.computerCount = computerCount;
	}

	@Override
	public String toString() {
		return "ComputerRoom [computerCount=" + computerCount + ", code=" + code + ", path=" + path + ", area=" + area
				+ ", lightCount=" + lightCount + "]";
	}

	@Override
	public boolean Qualified() {
		return ((area/computerCount) <= 1.5) && (area/lightCount<=10) ;
	}
	
	
	
	
}
