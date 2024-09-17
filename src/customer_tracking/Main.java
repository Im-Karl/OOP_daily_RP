package customer_tracking;

import java.awt.DisplayMode;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static final Room ComputerRoom = null;
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		ListRoom<Room>list = new ListRoomImpl();
		Integer choose = -1;
		do {
			choose = choose();
			switch (choose) {
			case 1 -> adddRoom(list);
			case 2 -> removeRoom(list);
			case 3 -> list.displayRoom();
			case 4 -> searchRoom(list);
			case 5 -> displayRoomIsQualified(list);
			case 6 -> {list.sortDescWithPath();
				list.displayRoom();
			}
			case 7 -> {list.sortWithLightCount();
				list.displayRoom();
			}
			case 8 -> {list.sortAscWithArea() ;
				list.displayRoom();
			}
			case 9 -> displayComputerRoom(list);
			case 10 -> updateComputerRoom(list);
			case 11 -> System.out.println("So luong phong hoc: "+list.size());
			default -> throw new Exception("I don't know. You have mistake with programe this mine.");
			}
			
		}while(choose!=0);
		
	}
	
	private static void displayRoomIsQualified(ListRoom<Room> list) {
		List<Room> newroom = list.roomisQualified();
		for(Room r: newroom) {
			System.out.println(r.toString());
		}
	}

	private static void displayComputerRoom(ListRoom<Room> list) {
		List<Room> newroom = list.computerRoom();
		System.out.println(newroom.toString());
	}
	

	private static void updateComputerRoom(ListRoom<Room> list) throws Exception {
		System.out.println("Nhap ma code phong:");
		String code = sc.nextLine();
		Room room = list.searchRoom(code);
		if(room==null) {
			throw new Exception("Ko co phong co code nay`");
		}else {
			System.out.println("Nhap so bong den muon thay doi:");
			Integer count = Integer.parseInt(sc.nextLine());
			((ComputerRoom)room).setComputerCount(count);
			list.updateRoom(room, code);			
		}
	}

	private static void searchRoom(ListRoom<Room> list) {
		System.out.println("Nhap ma code phong muon tim");
		String newcode = sc.nextLine();
		System.out.println((list.searchRoom((newcode))).toString());
	}


	private static Object removeRoom(ListRoom<Room> list) {
		System.out.println("Nhap ma code phong muon xoa");
		String z = sc.nextLine();
		System.out.println("Ban that su muon xoa phong?: \n"
				+ "1) De dong y. \n"
				+ "phim bat ky de huy.\n");
		int x = Integer.parseInt(sc.nextLine());
		if(x ==1) {
			list.remove(z);
		}else {
			System.out.println("Ban da huy thao tac xoa phong!");
		}
		return list;
	}

	public static void adddRoom(ListRoom<Room>list) throws Exception {
		Integer choice =0;
		System.out.println("Chon phong muon tao:  1-Computer"
		 		+ "2- Theory"
		 		+ "3- Testing");
		choice = Integer.parseInt(sc.nextLine());
		switch (choice) {
		
		case 1: {
			 ComputerRoom room =  new ComputerRoom();
			 System.out.println("Nhap ma code");
			 room.setCode(sc.nextLine());
			 System.out.println("Nhap ma path");
			 room.setPath(Integer.parseInt(sc.nextLine()));
			 System.out.println("Nhap dien tich");
			 room.setArea(Double.parseDouble(sc.nextLine()));
			 System.out.println("Nhap so bong den");
			 room.setLightCount(Integer.parseInt(sc.nextLine()));
			 System.out.println("Nhap so may tinh");
			 room.setComputerCount(Integer.parseInt(sc.nextLine()));
			 list.addRoom(room);
			 break;
		}
		case 2: {
			 TheoryRoom room =  new TheoryRoom();
			 System.out.println("Nhap ma code");
			 room.setCode(sc.nextLine());
			 System.out.println("Nhap ma path");
			 room.setPath(Integer.parseInt(sc.nextLine()));
			 System.out.println("Nhap dien tich");
			 room.setArea(Double.parseDouble(sc.nextLine()));
			 System.out.println("Nhap so bong den");
			 room.setLightCount(Integer.parseInt(sc.nextLine()));
			 System.out.println("Nhap co may chieu hay khong (1: true , other:false)");
			 Integer choose = Integer.parseInt(sc.nextLine());
			 room.setProjector(choose.equals(1));
			 list.addRoom(room);
			 break;
		}
		case 3: {
			 TestingRoom room =  new TestingRoom();
			 System.out.println("Nhap ma code");
			 room.setCode(sc.nextLine());
			 System.out.println("Nhap ma path");
			 room.setPath(Integer.parseInt(sc.nextLine()));
			 System.out.println("Nhap dien tich");
			 room.setArea(Double.parseDouble(sc.nextLine()));
			 System.out.println("Nhap so bong den");
			 room.setLightCount(Integer.parseInt(sc.nextLine()));
			 System.out.println("Nhap chuyen nganh");
			 room.setMajor(sc.nextLine());
			 System.out.println("Nhap so luong nguoi toi da");
			 room.setSize(Integer.parseInt(sc.nextLine()));
			 System.out.println("Nhap co bon rua hay khong.(1: true , other:false)");
			 Integer choose = Integer.parseInt(sc.nextLine());
			 room.setHasSink(choose.equals(1));
			 list.addRoom(room);
			 break;
		}
		default: throw new Exception("Error");
		}
	 }
	 
	 public static Integer choose() {
			System.out.println("Chao mung den voi quan ly phong hoc :");
			System.out.println("0) Thoat chuong trinh");
			System.out.println("1) Them phong hoc:");
			System.out.println("2) Xoa phong hoc:");
			System.out.println("3) Hien thi ta ca phong hoc:");
			System.out.println("4) Tim kiem phong hoc:");
			System.out.println("5) Hien thi tat ca phong hoc tieu chuan:");
			System.out.println("6) Hien thi phong sap xep theo cot day nha:");
			System.out.println("7) Hien thi phong theo so bong den:");
			System.out.println("8) Hien thi phong theo dien tich:");
			System.out.println("9) Hien thi phong co 60 may:");
			System.out.println("10) Cap nhat phong cho mot phong may tinh:");
			System.out.println("11) Hien thi tong so luong phong hoc: ");
			System.out.println("Vui lòng chọn bước tiếp theo!!");
		 return Integer.parseInt(sc.nextLine());
	 }
	 
	
}
