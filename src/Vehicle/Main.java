package Vehicle;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ListVehicle<Vehicle> list = new VehicleImpls();
		Integer choice  = -1;
		do {
			choice  = choice();
			switch(choice) {
			case 1 -> addVehicle(list); 
			case 2 -> removeVehicle1(list);
			case 3 -> list.displayVehicle();
			case 4 -> searchVehicle1(list);
			case 5 -> {list.sortVehicleWithID();
					list.displayVehicle();
			}
			case 6 -> {list.sortVehicleWithPrice();
					list.displayVehicle();
			}
			case 7 -> listQualified(list);
			case 8 -> updateVehicle(list);
			case 9 -> list.size();
			case 10 -> list.clearAll();
			case 11 -> searchVehicle2(list);
			}
		}while(choice != 0);
	}

	public static void form() {
		System.out.printf("%-5s %-20s %-15s %-10s %-10s%n", "ID", "Brand", "Type", "Speed", "Price");
        System.out.println("-------------------------------------------------------------------------------");
	}
	
	public static void displayAgain(Vehicle v) {
        // In danh sách phương tiện
        System.out.printf("%-5d %-20s %-15s %-10d %-10d %s%n", 
                v.getId(), v.getBrand(), v.getType(), v.getSpeed(), v.getPrice(), v.toString());
	}

	private static Object updateVehicle(ListVehicle<Vehicle> list) {
		System.out.println("Nhap ID phuong tien:");
		Integer newID = Integer.parseInt(sc.nextLine());
		Vehicle v = list.searchVehicle(newID);
		if(v==null) {
			System.out.println("Khong ton tai ID nay!!");
		}else {
			System.out.println("Nhap gia tien muon thay doi:");
			Integer newPrice  = Integer.parseInt(sc.nextLine());
			v.setPrice(newPrice);
		}
		return list;
	}


	private static void listQualified(ListVehicle<Vehicle> list) {
		List<Vehicle> newlist = list.listqualified();
		for(Vehicle v: newlist) {
			displayAgain(v);
		}
	}



	private static void searchVehicle1(ListVehicle<Vehicle> list) {
		System.out.println("Nhap Id Phuong tien muon tim:");
		Integer newID = Integer.parseInt(sc.nextLine());
		//System.out.println((list.searchVehicle(newID)).toString());
		form();
		displayAgain(list.searchVehicle(newID));
	}

	private static void searchVehicle2(ListVehicle<Vehicle> list) {
	    System.out.println("Nhập Kiểu Phương tiện muốn tìm:");
	    String newtype = sc.nextLine();
	    List<Vehicle> results = ((VehicleImpls) list).searchVehicle(newtype); 
	    if (results.isEmpty()) {
	        System.out.println("Không có gì cả!!");
	    } else {
	    	form();
	        for (Vehicle v : results) {
	            displayAgain(v);
	        }
	    }
	}


	private static Object removeVehicle1(ListVehicle<Vehicle> list) {
		System.out.println("Nhap id phuong tien muon xoa:");
		Integer newID = Integer.parseInt(sc.nextLine());
		System.out.println("Ban that su muon xoa phong?: \n"
				+ "1) De dong y. \n"
				+ "phim bat ky de huy.\n");
		int x = Integer.parseInt(sc.nextLine());
		if(x ==1) {
			list.removeVehicle(newID);
		}else {
			System.out.println("Ban da huy thao tac xoa phong!");
		}
		return list;
		}



	private static void addVehicle(ListVehicle<Vehicle> list){
		Integer choice =0;
		System.out.println("Please choose the typr of vehicle\n"
				+ "1) BikeCycle\n"
				+ "2) MotorBike\n"
				+ "3) Car\n"
				+ "4) Truck\n"
				+ "5) Coach");
		choice = Integer.parseInt(sc.nextLine());
		switch(choice) {
		case 1: 
			BikeCycle bike = new BikeCycle();
			System.out.println("Nhap ma id:");
			Integer id1 = Integer.parseInt(sc.nextLine());
			bike.setId(id1);
			System.out.println("Nhap brand:");
			String brand = sc.nextLine();
			bike.setBrand(brand);
			bike.setType("Xe Dap");
			System.out.println("Nhap toc do:");
			Integer speed = Integer.parseInt(sc.nextLine());// ktra nếu không phải int thì nhập lại, nếu là int thì xét trong khoang từ 10-500
			bike.setSpeed(speed);
			System.out.println("Nhap gia tien:");//ktra nếu không phải int thì nhập lại, nếu là int thì xét trong khoang từ 100 000-500 000 000 000
			Integer price = Integer.parseInt(sc.nextLine());
			bike.setPrice(price);
			System.out.println("Nhap loai lop:");// Sau này nên làm một danh sách lưu tất cả các material để check trường hợp xuất hiện trong đó mới cho thêm.
			String tyre = sc.nextLine();
			bike.setTyre(tyre);
			list.addVehicle(bike);
			break;
		case 2:
			MotorBike motor = new MotorBike();
			System.out.println("Nhap ma id:");
			Integer id2 = Integer.parseInt(sc.nextLine());
			motor.setId(id2);
			System.out.println("Nhap brand:");
			motor.setBrand(sc.nextLine());
			motor.setType("Xe May");
			System.out.println("Nhap toc do:");
			motor.setSpeed(Integer.parseInt(sc.nextLine()));
			System.out.println("Nhap gia tien:");
			motor.setPrice(Integer.parseInt(sc.nextLine()));
			System.out.println("Nhap nhieu lieu:");
			motor.setFuel(sc.nextLine());// Sau này nên làm một danh sách lưu tất cả các loại nhiên liệu để check trường hợp xuất hiện trong đó mới cho thêm.
			list.addVehicle(motor);
			break;
		case 3:
			Car car = new Car();
			System.out.println("Nhap ma id:");
			Integer id3 = Integer.parseInt(sc.nextLine());
			car.setId(id3);
			System.out.println("Nhap brand:");
			car.setBrand(sc.nextLine());
			car.setType("O To");
			System.out.println("Nhap toc do:");
			car.setSpeed(Integer.parseInt(sc.nextLine()));
			System.out.println("Nhap gia tien:");
			car.setPrice(Integer.parseInt(sc.nextLine()));
			System.out.println("Nhap nhieu lieu:");
			car.setFuel(sc.nextLine());// Sau này nên làm một danh sách lưu tất cả các loại nhiên liệu để check trường hợp xuất hiện trong đó mới cho thêm.
			System.out.println("Nhap so cho ngoi:");
			car.setSeat(Integer.parseInt(sc.nextLine()));//ktra nếu không phải int thì nhập lại, nếu là int thì xét trong khoang từ 2 - 7 chỗ
			list.addVehicle(car);
			break;
		case 4:
			Truck truck = new Truck();
			System.out.println("Nhap ma id:");
			Integer id4 = Integer.parseInt(sc.nextLine());
			truck.setId(id4);
			System.out.println("Nhap brand:");
			truck.setBrand(sc.nextLine());
			truck.setType("Xe Tai");
			System.out.println("Nhap toc do:");
			truck.setSpeed(Integer.parseInt(sc.nextLine()));
			System.out.println("Nhap gia tien:");
			truck.setPrice(Integer.parseInt(sc.nextLine()));
			System.out.println("Nhap nhieu lieu:");
			truck.setFuel(sc.nextLine());
			System.out.println("Nhap tai trong:");
			truck.setWeight(Integer.parseInt(sc.nextLine()));//ktra nếu không phải int thì nhập lại, nếu là int thì xét trong khoang từ 500-30 000kg
			list.addVehicle(truck);
			break;
		case 5:
			Coach coach = new Coach();
			System.out.println("Nhap ma id:");
			Integer id5 = Integer.parseInt(sc.nextLine());
			coach.setId(id5);
			System.out.println("Nhap brand:");
			coach.setBrand(sc.nextLine());
			coach.setType("Xe Khach");
			System.out.println("Nhap toc do:");
			coach.setSpeed(Integer.parseInt(sc.nextLine()));
			System.out.println("Nhap gia tien:");
			coach.setPrice(Integer.parseInt(sc.nextLine()));
			System.out.println("Nhap nhieu lieu:");
			coach.setFuel(sc.nextLine());
			System.out.println("Nhap so cho ngoi:");//ktra nếu không phải int thì nhập lại, nếu là int thì xét trong khoang từ 16 - 45 chỗ
			coach.setSeat(Integer.parseInt(sc.nextLine()));
			System.out.println("Nhap tram den:");
			coach.setStation(sc.nextLine());// Sau này nên làm một danh sách lưu tất cả các loại trạm đến để check trường hợp xuất hiện trong đó mới cho thêm.
			list.addVehicle(coach);
			break;
		}
	}
	private static Integer choice() {
		System.out.println("-----Welcome to list Vehicle-----");
		System.out.println("0) Exit Program");
		System.out.println("1) Add Vehicle");
		System.out.println("2) Remove Vehicle");
		System.out.println("3) Display List");
		System.out.println("4) Find vehicle with ID");
		System.out.println("5) Sort Vehicle With ID");
		System.out.println("6) Sort Vehicle With Price");
		System.out.println("7) Vehicle Qualified");
		System.out.println("8) Update Vehicle");
		System.out.println("9) Take the size");
		System.out.println("10) Clear list");
		System.out.println("Please choose one option!!!");
		return Integer.parseInt(sc.nextLine());
	}
	
}
