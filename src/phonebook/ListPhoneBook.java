package phonebook;

import java.util.List;

public interface ListPhoneBook<T> {
	void addPhone(T phone) throws Exception;
	T searchRoomArccodingAdr(String address);
	T searchRoomArccodingNum(String number);
	void  updateNumberPhone(String name, String phone);
	void remove(String number);
	Integer size();
	List<T> displayPhone();
}
