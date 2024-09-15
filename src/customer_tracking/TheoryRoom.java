package customer_tracking;

public class TheoryRoom extends Room{
	private boolean isProjector;

	
	
	public TheoryRoom() {
		super();
	}



	public boolean isProjector() {
		return isProjector;
	}



	public void setProjector(boolean isProjector) {
		this.isProjector = isProjector;
	}



	public TheoryRoom(String code, Integer path, Double area, Integer lightCount, boolean isProjector) {
		super(code, path, area, lightCount);
		this.isProjector = isProjector;
	}



	@Override
	public boolean Qualified() {
		return (isProjector &&(area/lightCount>=10));
	}



	@Override
	public String toString() {
		return "TheoryRoom [code=" + code + ", path=" + path + ", area=" + area
				+ ", lightCount=" + lightCount + "isProjector=" + isProjector +  "]";
	}
	
	
	
}
