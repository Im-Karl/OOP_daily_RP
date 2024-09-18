package Ex5;

import java.util.LinkedList;

public class LinkedListOperations {

    // Phương thức chuyển đổi các chuỗi trong danh sách thành chữ hoa
    public static void convertToUpperCase(LinkedList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).toUpperCase());
        }
    }

    // Phương thức di chuyển tất cả các phần tử từ danh sách này sang danh sách khác
    public static void moveElements(LinkedList<String> sourceList, LinkedList<String> destinationList) {
        // Chuyển tất cả các phần tử từ sourceList sang destinationList
        destinationList.addAll(sourceList);
        // Xoá tất cả các phần tử trong sourceList
        sourceList.clear();
    }

    public static void main(String[] args) {
        // Tạo danh sách đầu tiên với các chuỗi
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("cherry");

        // Tạo danh sách thứ hai với các chuỗi
        LinkedList<String> list2 = new LinkedList<>();

        // Chuyển đổi tất cả các chuỗi trong list1 thành chữ hoa
        convertToUpperCase(list1);

        // Di chuyển tất cả các phần tử từ list1 sang list2
        moveElements(list1, list2);

        // In danh sách đầu tiên (nên trống)
        System.out.println("Danh sách 1 sau khi di chuyển: " + list1);

        // In danh sách thứ hai (nên chứa tất cả các phần tử chuyển đổi sang chữ hoa)
        System.out.println("Danh sách 2 sau khi di chuyển: " + list2);
    }
}
