package Vehicle;
import java.util.List;
import java.util.Scanner;
import java.math.BigInteger;


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
			case 12 -> searchVehicle3(list);
			}
		}while(choice != 0);
	}

	private static void searchVehicle3(ListVehicle<Vehicle> list) {
		System.err.println("Nhập giá trị min: ");
		BigInteger min = sc.nextBigInteger();
		sc.nextLine();
		System.out.println("Nhập giá trị max");
		BigInteger max = sc.nextBigInteger();
		sc.nextLine();
        List<Vehicle> results = ((VehicleImpls) list).searchVehicle(min,max);
        if (results.isEmpty()) {
            System.out.println("Không có gì cả!!!!");
        } else {
        	System.out.println("Size: "+list.size());
            form();
            for (Vehicle v : results) {
                displayAgain(v);
            }
        }
	}

	public static void form() {
		System.out.printf("%-5s %-20s %-15s %-10s %-15s %-18s%n", "ID", "Brand", "Type",  "Speed (Km/h)", "Price (Dong)", "Details");
        System.out.println("-------------------------------------------------------------------------------");
	}
	
	public static void displayAgain(Vehicle v) {
        // In danh sách phương tiện
        System.out.printf("%-5d %-20s %-15s %-15d %-13d %s%n", 
                v.getId(), v.getBrand(), v.getType(), v.getSpeed(), v.getPrice(), v.toString());
	}
	private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }
	private static Integer getIntegerInput(String prompt, Integer minValue, Integer maxValue) {
        while (true) {
            System.out.print(prompt);
            try {
            	int input = Integer.parseInt(sc.nextLine());
                if (input < minValue || input > maxValue) {
                    System.out.println("Giá trị phải nằm trong khoảng từ " + minValue + " đến " + maxValue + ".");
                } else {
                    return input;
                }
            } catch (NumberFormatException e) {
                System.out.println("Dữ liệu không hợp lệ. Vui lòng nhập một số nguyên hợp lệ.");
            }
        }
    }
	private static BigInteger getBigIntegerInput(String prompt, BigInteger minValue, BigInteger maxValue) {
        while (true) {
            System.out.print(prompt);
            try {
                BigInteger input = new BigInteger(sc.nextLine());
                if (input.compareTo(minValue) < 0 || input.compareTo(maxValue) > 0) {
                    System.out.println("Giá trị phải nằm trong khoảng từ " + minValue + " đến " + maxValue + ".");
                } else {
                    return input;
                }
            } catch (NumberFormatException e) {
                System.out.println("Dữ liệu không hợp lệ. Vui lòng nhập một số nguyên hợp lệ.");
            }
        }
    }
	private static Object updateVehicle(ListVehicle<Vehicle> list) {
		System.out.println("Nhap ID phuong tien:");
		Integer newID = Integer.parseInt(sc.nextLine());
		Vehicle v = list.searchVehicle(newID);
		if(v==null) {
			System.out.println("Khong ton tai ID nay!!");
		}else {
			System.out.println("Nhap gia tien muon thay doi:");
			BigInteger newPrice  = new BigInteger(sc.nextLine());
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
        Integer newID = getIntegerInput("Enter vehicle ID to search: ",0,Integer.MAX_VALUE);
        form();
        Vehicle v = list.searchVehicle(newID);
        if (v != null) {
            displayAgain(v);
        } else {
            System.out.println("No vehicle found with this ID.");
        }
    }
	
//	private static void searchVehicle1(ListVehicle<Vehicle> list) {
//		System.out.println("Nhap Id Phuong tien muon tim:");
//		Integer newID = Integer.parseInt(sc.nextLine());
//		//System.out.println((list.searchVehicle(newID)).toString());
//		form();
//		Vehicle v = list.searchVehicle(newID);
//        if (v != null) {
//            displayAgain(v);
//        } else {
//            System.out.println("No vehicle found with this ID.");
//        }
//	}
	
	private static void searchVehicle2(ListVehicle<Vehicle> list) {
        String newType = getStringInput("Nhập Kiểu Phương tiện muốn tìm: ");
        List<Vehicle> results = ((VehicleImpls) list).searchVehicle(newType);
        if (results.isEmpty()) {
            System.out.println("Không có gì cả!!!!");
        } else {
        	System.out.println("Size: "+list.size());
            form();
            for (Vehicle v : results) {
                displayAgain(v);
            }
        }
    }
	
//	private static void searchVehicle2(ListVehicle<Vehicle> list) {
//	    System.out.println("Nhập Kiểu Phương tiện muốn tìm:");
//	    String newtype = sc.nextLine();
//	    List<Vehicle> results = ((VehicleImpls) list).searchVehicle(newtype); 
//	    if (results.isEmpty()) {
//	        System.out.println("Không có gì cả!!");
//	    } else {
//	    	form();
//	        for (Vehicle v : results) {
//	            displayAgain(v);
//	        }
//	    }
//	}

	private static void removeVehicle1(ListVehicle<Vehicle> list) {
        Integer newID = getIntegerInput("Nhap id phuong tien muon xoa: ",0,Integer.MAX_VALUE);
        System.out.println("Ban that su muon xoa phong? \n" +
                "1) De dong y \n" +
                "phim bat ky de huy..");
        int x = getIntegerInput("",0,0);
        if (x == 1) {
            list.removeVehicle(newID);
        } else {
            System.out.println("Deletion canceled!");
        }
    }
	
//	private static void removeVehicle1(ListVehicle<Vehicle> list) {
//		System.out.println("Nhap id phuong tien muon xoa:");
//		Integer newID = Integer.parseInt(sc.nextLine());
//		System.out.println("Ban that su muon xoa phong?: \n"
//				+ "1) De dong y. \n"
//				+ "phim bat ky de huy.\n");
//		int x = Integer.parseInt(sc.nextLine());
//		if(x ==1) {
//			list.removeVehicle(newID);
//		}else {
//			System.out.println("Ban da huy thao tac xoa phong!");
//		}
//		return list;
//	}



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
			bike.setId(getIntegerInput("Nhap ma id:",0,Integer.MAX_VALUE));
			bike.setBrand(getStringInput("Nhap brand:"));
			bike.setType("Xe Dap");
			bike.setSpeed(getIntegerInput("Nhập tốc độ:", 10, 500));
			bike.setPrice(getBigIntegerInput("Nhập giá tiền:", BigInteger.valueOf(100000), BigInteger.valueOf(500000000000L)));
            bike.setTyre(getStringInput("Nhập loại lốp: "));// Sau này nên làm một danh sách lưu tất cả các material để check trường hợp xuất hiện trong đó mới cho thêm.
            list.addVehicle(bike);
			break;
		case 2:
			MotorBike motor = new MotorBike();
            motor.setId(getIntegerInput("Nhap ma id:",0,Integer.MAX_VALUE));
            motor.setBrand(getStringInput("Nhap brand:"));
            motor.setType("Xe May");
            motor.setSpeed(getIntegerInput("Nhập tốc độ:", 10, 500));
            motor.setPrice(getBigIntegerInput("Nhập giá tiền:", BigInteger.valueOf(100000), BigInteger.valueOf(500000000000L)));
            motor.setFuel(getStringInput("Nhap nhieu lieu: "));// Sau này nên làm một danh sách lưu tất cả các loại nhiên liệu để check trường hợp xuất hiện trong đó mới cho thêm.
            list.addVehicle(motor);
			break;
		case 3:
			Car car = new Car();
			car.setId(getIntegerInput("Nhap ma id:",0,Integer.MAX_VALUE));
			car.setBrand(getStringInput("Nhap brand:"));
			car.setType("O To");
			car.setSpeed(getIntegerInput("Nhập tốc độ:", 10, 500));
			car.setPrice(getBigIntegerInput("Nhập giá tiền:", BigInteger.valueOf(100000), BigInteger.valueOf(500000000000L)));
			car.setFuel(getStringInput("Nhap nhieu lieu: ")); //Sau này nên làm một danh sách lưu tất cả các loại nhiên liệu để check trường hợp xuất hiện trong đó mới cho thêm.
			car.setSeat(getIntegerInput("Nhap so luong cho ngoi ",4,8));;//ktra nếu không phải int thì nhập lại, nếu là int thì xét trong khoang từ 2 - 7 chỗ
			list.addVehicle(car);
			break;
		case 4:
			Truck truck = new Truck();
			truck.setId(getIntegerInput("Nhap ma id:",0,Integer.MAX_VALUE));
			truck.setBrand(getStringInput("Nhap brand:"));
			truck.setType("Xe Tai");
			truck.setSpeed(getIntegerInput("Nhập tốc độ:", 10, 500));
			truck.setPrice(getBigIntegerInput("Nhập giá tiền:", BigInteger.valueOf(100000), BigInteger.valueOf(500000000000L)));
			truck.setFuel(getStringInput("Nhap nhieu lieu: "));
			truck.setWeight(getIntegerInput("Nhap tai trong: ",500,30000));//ktra nếu không phải int thì nhập lại, nếu là int thì xét trong khoang từ 500-30 000kg
			list.addVehicle(truck);
			break;
		case 5:
			Coach coach = new Coach();
			coach.setId(getIntegerInput("Nhap ma id:",0,Integer.MAX_VALUE));
			coach.setBrand(getStringInput("Nhap brand:"));
			coach.setType("Xe Khach");
			coach.setSpeed(getIntegerInput("Nhập tốc độ:", 10, 500));
			coach.setPrice(getBigIntegerInput("Nhập giá tiền:", BigInteger.valueOf(100000), BigInteger.valueOf(500000000000L)));
			coach.setFuel(getStringInput("Nhap nhieu lieu: "));
			coach.setSeat(getIntegerInput("Nhap so luong cho ngoi: ",16,46));//ktra nếu không phải int thì nhập lại, nếu là int thì xét trong khoang từ 16 - 45 chỗ
			coach.setStation(getStringInput("Nhap tram den: "));// Sau này nên làm một danh sách lưu tất cả các loại trạm đến để check trường hợp xuất hiện trong đó mới cho thêm.
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
