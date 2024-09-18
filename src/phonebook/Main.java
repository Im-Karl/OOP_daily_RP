package phonebook;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ListPhoneBook<PhoneNumber> phoneBook = new Tracking();
        Integer choice;

        do {
            choice = showMenu();
            switch (choice) {
                case 1 -> addNumber(phoneBook);
                case 2 -> removeNumber(phoneBook);
                case 3 -> updateNumber(phoneBook);
                case 4 -> phoneBook.displayPhone();
                case 5 -> findByNumber(phoneBook);
                case 6 -> findByAddress(phoneBook);
            }
        } while (choice != 0);
    }

    private static void addNumber(ListPhoneBook<PhoneNumber> phoneBook) {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter number: ");
        String number = sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        
        // Check if the number already exists
        if (phoneBook.searchRoomArccodingNum(number) == null) {
            PhoneNumber newPhone = new PhoneNumber(name, number, address);
            try {
                phoneBook.addPhone(newPhone);
                System.out.println("Phone number added successfully!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Phone number already exists!");
        }
    }

    private static void removeNumber(ListPhoneBook<PhoneNumber> phoneBook) {
        System.out.print("Enter number to remove: ");
        String number = sc.nextLine();
        phoneBook.remove(number);
    }

    private static void updateNumber(ListPhoneBook<PhoneNumber> phoneBook) {
        System.out.print("Enter name to update: ");
        String name = sc.nextLine();
        System.out.print("Enter new number: ");
        String newNumber = sc.nextLine();
        phoneBook.updateNumberPhone(name, newNumber);
        System.out.println("Phone number updated successfully!");
    }

    private static void findByNumber(ListPhoneBook<PhoneNumber> phoneBook) {
        System.out.print("Enter number to find: ");
        String number = sc.nextLine();
        PhoneNumber result = phoneBook.searchRoomArccodingNum(number);
        if (result != null) {
            System.out.println("Found: " + result);
        } else {
            System.out.println("Number not found!");
        }
    }

    private static void findByAddress(ListPhoneBook<PhoneNumber> phoneBook) {
        System.out.print("Enter address to find: ");
        String address = sc.nextLine();
        PhoneNumber result = phoneBook.searchRoomArccodingAdr(address);
        if (result != null) {
            System.out.println("Found: " + result);
        } else {
            System.out.println("Address not found!");
        }
    }

    public static Integer showMenu() {
        System.out.println("Welcome to our phone book");
        System.out.println("0) Exit the program");
        System.out.println("1) Add phone number");
        System.out.println("2) Remove phone number");
        System.out.println("3) Update phone number");
        System.out.println("4) Display all contacts");
        System.out.println("5) Find person by phone number");
        System.out.println("6) Find person by address");
        System.out.print("Please choose an option: ");
        return Integer.parseInt(sc.nextLine());
    }
}