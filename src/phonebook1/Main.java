package phonebook1;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        int choice;

        do {
            choice = showMenu();
            switch (choice) {
                case 1 -> addPhoneNumber(phoneBook, scanner);
                case 2 -> searchByAddress(phoneBook, scanner);
                case 3 -> phoneBook.displayAll();
                case 0 -> System.out.println("Thoát khỏi chương trình.");
                default -> System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
            }
        } while (choice != 0);
    }

    private static void addPhoneNumber(PhoneBook phoneBook, Scanner scanner) {
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        phoneBook.addPhoneNumber(address, phoneNumber);
        System.out.println("Số điện thoại đã được thêm thành công!");
    }

    private static void searchByAddress(PhoneBook phoneBook, Scanner scanner) {
        System.out.print("Nhập địa chỉ cần tra cứu: ");
        String address = scanner.nextLine();
        List<String> phoneNumbers = phoneBook.searchByAddress(address);
        if (phoneNumbers.isEmpty()) {
            System.out.println("Không tìm thấy số điện thoại cho địa chỉ này.");
        } else {
            System.out.println("Số điện thoại tại địa chỉ " + address + ": " + phoneNumbers);
        }
    }

    private static int showMenu() {
        System.out.println("Chương trình danh bạ điện thoại");
        System.out.println("0) Thoát");
        System.out.println("1) Thêm số điện thoại");
        System.out.println("2) Tra cứu theo địa chỉ");
        System.out.println("3) Hiển thị tất cả danh bạ");
        System.out.print("Vui lòng chọn: ");
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }
}