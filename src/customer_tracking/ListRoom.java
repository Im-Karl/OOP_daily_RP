package customer_tracking;

import java.util.List;

public interface ListRoom<T> {
	
	void addRoom(T room) throws Exception;
	T searchRoom(String code);
	void sortDescWithPath();
	void sortAscWithArea();
	void sortWithLightCount();
	void updateRoom(T room,String code);
	void remove(String code);
	Integer size();
	List<T>computerRoom();
	
	
}
