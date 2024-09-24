package Vehicle;

import java.util.List;
import java.util.Queue;

public interface ListVehicle<T> {
	void addVehicle(T v);
	T searchVehicle(Integer code);
	void removeVehicle(Integer id);
	void sortVehicleWithID();
	void sortVehicleWithPrice();
	List<T> displayVehicle();
	void updateVehicle(Vehicle vehicle, Integer id);
	List<T> qualified();
	Integer size();
	void clearAll();
}
