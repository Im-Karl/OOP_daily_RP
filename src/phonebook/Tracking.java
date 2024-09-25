package phonebook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Tracking implements ListPhoneBook<PhoneNumber>{
	
	ArrayList<PhoneNumber> list;
	
	public void ListNumber() {
		list = new ArrayList<>();
	}
	
	@Override
    public void addPhone(PhoneNumber phone) throws Exception {
        if (!list.contains(phone)) {
            list.add(phone);
        } else {
            throw new Exception("Phone number already exists in the list");
        }
    }

	@Override
    public PhoneNumber searchRoomArccodingAdr(String address) {
        for (PhoneNumber phone : list) {
            if (phone.getAddress().equalsIgnoreCase(address)) {
                return phone;
            }
        }
        return null; 
    }

	@Override
	public PhoneNumber searchRoomArccodingNum(String number) {
		for(PhoneNumber s : list) {
			if(s.getNumber().equalsIgnoreCase(number)) {
				return s;
			}
		}return null;
	}

	@Override
	public void updateNumberPhone( String name,String phone) {
		for(PhoneNumber s: list) {
			if(s.getName().equalsIgnoreCase(name)) {
				s.setNumber(phone);
				return;
			}
		}
	}

	@Override
    public void remove(String number) {
        Iterator<PhoneNumber> iterator = list.iterator();
        while (iterator.hasNext()) {
            PhoneNumber s = iterator.next();
            if (s.getNumber().equalsIgnoreCase(number)) {
                iterator.remove();
                return; 
            }
        }
        System.out.println("Phone number not found!");
    }

	@Override
	public Integer size() {
		return list.size();
	}

	@Override
	public List<PhoneNumber> displayPhone() {
		if(list.isEmpty()) {
			System.out.println("Meo co so nao ca!");
		}else {
			for(PhoneNumber r : list) {
				System.out.println(r.toString());
			}
		}
		return list;
	}
	
}
