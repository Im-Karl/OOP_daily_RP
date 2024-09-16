package customer_tracking;

public class TestingRoom extends Room{
	private String major;
	private Integer size;
	private boolean hasSink;

	
	
	
	public TestingRoom(String code, Integer path, Double area, Integer lightCount, String major, Integer size,
			boolean hasSink) {
		super(code, path, area, lightCount);
		this.major = major;
		this.size = size;
		this.hasSink = hasSink;
	}




	public String getMajor() {
		return major;
	}




	public void setMajor(String major) {
		this.major = major;
	}




	public Integer getSize() {
		return size;
	}




	public void setSize(Integer size) {
		this.size = size;
	}




	public boolean isHasSink() {
		return hasSink;
	}




	public void setHasSink(boolean hasSink) {
		this.hasSink = hasSink;
	}




	public TestingRoom() {
		super();
	}




	@Override
	public boolean Qualified() {
		return (hasSink && (area/lightCount>=10));
	}




	@Override
	public String toString() {
		return "TestingRoom [code=" + code + ", path=" + path + ", area=" + area + ", lightCount=" + lightCount + ", major=" + major + ", size=" + size +  ", hasSink=" + hasSink + "]";
	}
	
}
