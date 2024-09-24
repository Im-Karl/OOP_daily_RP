package phonebook1;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> addressBook; // Một địa chỉ có nhiều số điện thoại so 
    											//sử dụng key map với value là arraylist

    public PhoneBook() {
        addressBook = new HashMap<>();
    }

    // Thêm số điện thoại vào địa chỉ
    public void addPhoneNumber(String address, String phoneNumber) {
        addressBook.computeIfAbsent(address, k -> new ArrayList<>()).add(phoneNumber);
    }

    // Tìm kiếm số điện thoại theo địa chỉ
    public List<String> searchByAddress(String address) {
        return addressBook.getOrDefault(address, Collections.emptyList());
    }

    // Hiển thị tất cả thông tin trong danh bạ
    public void displayAll() {
        if (addressBook.isEmpty()) {
            System.out.println("Danh bạ trống.");
        } else {
            for (Map.Entry<String, List<String>> entry : addressBook.entrySet()) {
                System.out.println("Địa chỉ: " + entry.getKey() + " -> Số điện thoại: " + entry.getValue());
            }
        }
    }
}