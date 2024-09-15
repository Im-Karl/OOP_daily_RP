package customer_tracking;

import java.util.ArrayList;
import java.util.List;

public class ListRoomImpl implements ListRoom<Room>{

	List<Room> list;
	
	
	

	public ListRoomImpl() {
		list = new ArrayList<Room>();
	}

	public ListRoomImpl(List<Room> list) {
		super();
		this.list = list;
	}

	@Override
	public void addRoom(Room room) throws Exception {
		if(!list.contains(room)) {
			list.add(room);	
		}else {
			throw new Exception("Object is contain in list");
		}
		
	}

	@Override
	public Room searchRoom(String code) {
		for (Room room : list) {
			if(room.getCode().equalsIgnoreCase(code)) {
				return room;
			}
		}
		return null;
	}

	@Override
	public void sortDescWithPath() {
		list.sort((r1,r2)-> r1.getCode().compareTo(r2.getCode()));	
		
	}

	@Override
	public void sortAscWithArea() {
		list.sort((r1,r2)-> r2.getArea().compareTo(r1.getArea()));
	}

	@Override
	public void sortWithLightCount() {
		list.sort((r1,r2)-> r1.getLightCount().compareTo(r2.getLightCount()));
		
	}

	@Override
	public void updateRoom(Room room, String code) {

		for (Room r : list) {
			if(r.getCode().equalsIgnoreCase(code)) {
				r = room;
				return;
			}
		}
	}

	@Override
	public void remove(String code) {
		for (Room room : list) {
			if(room.getCode().equalsIgnoreCase(code)) {
				System.out.println("Ban co muon xoa khong");
					list.remove(room);
					return;
			}
		}
	}

	@Override
	public Integer size() {
		return list.size();
	}

	@Override
	public List<Room> computerRoom() {
		List<Room>tmpList = new ArrayList<Room>();
		for (Room room : tmpList) {
			if(room instanceof ComputerRoom && ((ComputerRoom)room).getComputerCount() > 60 ) {
				tmpList.add(room);
			}
		}
		return tmpList;
	}

}
