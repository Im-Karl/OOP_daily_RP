package Vehicle;
import java.util.List;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;
public class MainBug {


		public static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
			ListVehicle<Vehicle> list = new VehicleImpls();
			FuelList fuellist = new FuelList();
			StationList stationList = new StationList();
			BrandList brandList = new BrandList();
			PriceList priceList = new PriceList();
			TyreList tyreList = new TyreList();
			
			Integer choice;
	        do {
	            choice = -1;
	            switch (choice) {
	                case 1 -> {
	                    Integer choose = getIntegerInput("Bạn đang truy cập vào danh sách cửa hàng:\n"
	                    		+ "", 0, Integer.MAX_VALUE);
	                    do {
	                        switch (choose) {
	                            case 1 -> addVehicle(list);
	                            case 2 -> removeVehicle1(list);
	                            case 3 -> list.displayVehicle();
	                			case 4 -> searchVehicle1(list);
	                			case 5 -> searchVehicle2(list);
	                			case 6 -> searchVehicle3(list);
	                			case 7 -> searchVehicle4(list);
	                			case 8 -> {list.sortVehicleWithID();
	                					list.displayVehicle();
	                			}
	                			case 9 -> {list.sortVehicleWithPrice();
	                					list.displayVehicle();
	                			}
	                			case 10 -> listQualified(list);
	                			case 11 -> updateVehicle(list);
	                			case 12 -> list.size();
	                			case 13 -> list.clearAll();
	                            default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
	                        }
	                    } while (choose != 0); 
	                }
	                case 2 -> {
	                	Integer choose = getIntegerInput("Bạn đang truy cập vào danh sách đã bán:\n"
	                    		+ "", 0, Integer.MAX_VALUE);
	                    do {
	                        switch (choose) {
	                        case 1 -> list.displayVehicle();
	            			case 2 -> {list.sortVehicleWithPrice();
	    					list.displayVehicle();
	            			}
	            			case 3 -> {list.sortVehicleWithID();
	            					list.displayVehicle();
	            			}
	            			case 4 -> searchVehicle1(list);
	            			case 5 -> searchVehicle2(list);
	            			case 6 -> searchVehicle3(list);
	            			case 7 -> searchVehicle4(list);
	            			case 8 -> listQualified(list);
	            			case 9 -> updateVehicle(list); // cái này ở list đã bán thì chỉ có thể update bảo hiểm
	            			case 10 -> list.size();
	            			case 11 -> list.clearAll();
	                            default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
	                        }
	                    } while (choose != 0); 
	                }
	                case 3 -> {
	                	Integer choose = getIntegerInput("Bạn đang truy cập vào danh sách hết thời gian bảo hành:\n"
	                    		+ "", 0, Integer.MAX_VALUE);
	                    do {
	                        switch (choose) {
	                        case 1 -> list.displayVehicle();
	            			case 2 -> {list.sortVehicleWithPrice();
	    					list.displayVehicle();
	            			}
	            			case 3 -> {list.sortVehicleWithID();
	            					list.displayVehicle();
	            			}
	            			case 4 -> searchVehicle1(list);
	            			case 5 -> searchVehicle2(list);
	            			case 6 -> searchVehicle3(list);
	            			case 7 -> searchVehicle4(list);
	            			case 8 -> listQualified(list);
	            			case 9 -> updateVehicle(list); // cái này ở list đã bán thì chỉ có thể update bảo hiểm
	            			case 10 -> list.size();
	            			case 11 -> list.clearAll();
	                            default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
	                        }
	                    } while (choose != 0); 
	                }
	                case 4 -> {
//	                	Integer choose = getIntegerInput("Bạn đang truy cập vào quyền bán hàng:\n"
//	                    		+ "", 0, Integer.MAX_VALUE);
//	                    do {
//	                        choose = showStoreMenu(); // Assuming this method displays store options and returns the choice
//	                        switch (choose) {
//	                            case 1 -> {
//	                                System.out.println("Thực hiện chức năng 1.");
//	                            }
//	                            case 2 -> {
//	                                System.out.println("Thực hiện chức năng 2.");
//	                            }
//	                            default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
//	                        }
//	                    } while (choose != 0); 
	                }
	                case 5 -> {
	                	Integer choose = getIntegerInput("Bạn đang truy cập vào danh sách nhiên liệu:\n"
	                    		+ "", 0, Integer.MAX_VALUE);
	                    do {
	                        switch (choose) {
	                            case 1 -> addFuelList(fuellist);
	                            case 2 -> removeFuelList(fuellist);
	                            case 3 -> fuellist.displayFuel();
	                            default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
	                        }
	                    } while (choose != 0); 
	                }
	                case 6 -> {
	                	Integer choose = getIntegerInput("Bạn đang truy cập vào danh sách hãng xe:\n"
	                    		+ "", 0, Integer.MAX_VALUE);
	                    do {
	                        switch (choose) {
	                            case 1 -> addBrandList(brandList);
	                            case 2 -> removeBrandList(brandList);
	                            case 3 -> brandList.displayBrand();
	                            default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
	                        }
	                    } while (choose != 0); 
	                }
	                case 7 -> {
	                	Integer choose = getIntegerInput("Bạn đang truy cập vào danh sách trạm xe:\n"
	                    		+ "", 0, Integer.MAX_VALUE);
	                    do {
	                        switch (choose) {
	                            case 1 -> addStationList(stationList);
	                            case 2 -> removeStationList(stationList);
	                            case 3 -> stationList.displayStation();
	                            default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
	                        }
	                    } while (choose != 0); 
	                }
	                case 8 -> {
	                	Integer choose = getIntegerInput("Bạn đang truy cập vào danh sách loại lốp:\n"
	                    		+ "", 0, Integer.MAX_VALUE);
	                	do {
	                        switch (choose) {
	                            case 1 -> addTyreList(tyreList);
	                            case 2 -> removeTyreList(tyreList);
	                            case 3 -> tyreList.displayTyre();
	                            default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
	                        }
	                    } while (choose != 0); 
	                }
	            }
	        } while (choice != 0);

	        System.out.println("Kết thúc chương trình. Cảm ơn bạn!");
	    }
		
		public static void removeStationList(StationList stationlist) {
			String input = getStringInput("Nhập loại ga muốn xoá:");
			if(stationlist.getStationList().contains(input)) {
				System.out.println("Bạn thật sự muốn xoá?\n"
						+ "1) Để đồng ý\n"
						+ "Phím bất kỳ để huỷ");
				Integer choice = Integer.parseInt(sc.nextLine());
				if(choice ==1) {
					stationlist.removeStation(input);
					System.out.println("Trạm "+ input +" đã được xoá");
				}else {
					System.out.println("Đã huỷ thao tác xoá");
				}
			}else {
				System.out.println("Trạm "+ input +" không tồn tại");
			}			
		}
		
		public static void removeBrandList(BrandList brandlist) {
			String input = getStringInput("Nhập hãng muốn xoá:");
			if(brandlist.getBrandList().contains(input)) {
				System.out.println("Bạn thật sự muốn xoá?\n"
						+ "1) Để đồng ý\n"
						+ "Phím bất kỳ để huỷ");
				Integer choice = Integer.parseInt(sc.nextLine());
				if(choice ==1) {
					brandlist.removeBrand(input);
					System.out.println("Hãng "+ input +" đã được xoá");
				}else {
					System.out.println("Đã huỷ thao tác xoá");
				}
			}else {
				System.out.println("Hãng "+ input +" không tồn tại");
			}
		}
		
		public static void removeTyreList(TyreList tyrelist) {
			String input = getStringInput("Nhập loại lốp muốn xoá:");
			if(tyrelist.getTyreList().contains(input)) {
				System.out.println("Bạn thật sự muốn xoá?\n"
						+ "1) Để đồng ý\n"
						+ "Phím bất kỳ để huỷ");
				Integer choice = Integer.parseInt(sc.nextLine());
				if(choice ==1) {
					tyrelist.removeTyre(input);
					System.out.println("Loại lốp "+ input +" đã được xoá");
				}else {
					System.out.println("Đã huỷ thao tác xoá");
				}
			}else {
				System.out.println("Loại lốp "+ input +" không tồn tại");
			}
		}

		private static void removeFuelList(FuelList fuellist) {
			String input = getStringInput("Nhập loại nhiên liệu muốn xoá:");
			if(fuellist.getFuelList().contains(input)) {
				System.out.println("Bạn thật sự muốn xoá?\n"
						+ "1) Để đồng ý\n"
						+ "Phím bất kỳ để huỷ");
				Integer choice = Integer.parseInt(sc.nextLine());
				if(choice ==1) {
					fuellist.removeFuel(input);
					System.out.println("Nhiên liệu " + input + " đã được xoá.");
				}else {
					System.out.println("Đã huỷ thao tác xoá");
				}
	        } else {
	            System.out.println("Nhiên liệu " + input + " không có trong danh sách.");
			}
		}



		private static void searchVehicle4(ListVehicle<Vehicle> list) {
			String newcolour = getStringInput("Nhập màu sắc muốn tìm:");
			List<Vehicle> result = ((VehicleImpls) list).searchVehicleColor(newcolour);
			if(result.isEmpty()) {
				System.out.println("Không có gì cả!!");
			}else {
				System.out.println(result.size());
				form();
				for(Vehicle v : result) {
					displayAgain(v);
				}
			}
		}
		
		private static void addTyreList(TyreList tyreList) {
			String portion = getStringInput("Nhập loại lốp muốn thêm:");
			if(tyreList.getTyreList().contains(portion)) {
				System.out.println("Không thể thêm được vì đã xuất hiện "+ portion+" trong danh sách");
			}else {
				tyreList.addTyre(portion);
				System.out.println("Thêm "+ portion+" thành công");
			}
			
		}

		private static void addBrandList(BrandList brandList) {
			String portion = getStringInput("Nhập hãng muốn thêm:");
			if(brandList.getBrandList().contains(portion)) {
				System.out.println("Không thể thêm được vì đã xuất hiện "+ portion+" trong danh sách");
			}else {
				brandList.addBrand(portion);
				System.out.println("Thêm "+ portion+" thành công");
			}
		}

		private static void addStationList(StationList stationList) {
			String portion = getStringInput("Nhập ga muốn thêm:");
			if(stationList.getStationList().contains(portion)) {
				System.out.println("Không thể thêm được vì đã xuất hiện "+ portion+" trong danh sách");
			}else {
				stationList.addStation(portion);
				System.out.println("Thêm "+ portion+" thành công");
			}
		}

		private static void addFuelList(FuelList fuellist) {
			String portion = getStringInput("Nhập nhiên liệu muốn thêm:");
			if(fuellist.getFuelList().contains(portion)) {
				System.out.println("Không thể thêm được vì đã xuất hiện "+ portion+" trong danh sách");
			}else {
				fuellist.addFuel(portion);
				System.out.println("Thêm "+ portion+" thành công");
			}
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
	        	System.out.println("Size: "+results.size());
	            form();
	            for (Vehicle v : results) {
	                displayAgain(v);
	            }
	        }
		}

		public static void form() {
			System.out.printf("%-4s %-14s %-10s %-10s %-10s %-15s %-18s%n", "ID", "Brand", "Type","Colour",  "Speed (Km/h)", "Price (Dong)", "Details");
	        System.out.println("-------------------------------------------------------------------------------");
		}
		
		public static void displayAgain(Vehicle v) {
	        // In danh sách phương tiện
	        System.out.printf("%-4s %-14s %-10s %-15s %-10d %-7d %s%n", 
	                v.getId(), v.getBrand(), v.getType(),v.getColour(), v.getSpeed(), v.getPrice(), v.toString());
		}
		private static String getStringInput(String prompt) {
			String input;
		    while (true) {
		        System.out.print(prompt);
		        input = sc.nextLine().trim();
		        if (!input.isEmpty()) {
		            return input;
		        }
		        System.out.println("Thông tin không được để trống. Vui lòng nhập lại.");
		    }
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
				System.out.println("Vui lòng chọn kiểu thay đổi:\n"
						+ "1) Thay đổi theo phần trăm.\n"
						+ "2) Thay đổi giá tiền.\n"
						+ "Phím bất kỳ để huỷ....");
				Integer choice = Integer.parseInt(sc.nextLine());
				if(choice == 1 ) {
					System.out.println("Nhập phần trăm muốn thêm (ví dụ: 10 cho 10%):");
					Float percent = Float.parseFloat(sc.nextLine())/100;
					BigInteger currentPrice = v.getPrice();
					// Convert to BigDecimal for precise calculations
		            BigDecimal currentPriceBD = new BigDecimal(currentPrice);
		            BigDecimal percentBD = new BigDecimal(percent);
		            BigDecimal newPriceBD = currentPriceBD.multiply(BigDecimal.ONE.add(percentBD)); 
		            // Chuyển sáng BIgInt
		            v.setPrice(newPriceBD.toBigInteger());
				}else if(choice ==2 ) {
					BigInteger extraMoney  = getBigIntegerInput("Nhập giá tiền muốn thêm:", BigInteger.valueOf(500000), BigInteger.valueOf(1000000000));
					BigInteger currentPrice = v.getPrice();
					BigInteger newPrice= currentPrice.add(extraMoney);
					v.setPrice(newPrice);
				}else {
					System.out.println("Huỷ thao tác thành công!!");
				}
				
			}
			return list;
		}
		
		// Làm thêm cái update bảo hiểm


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
		
//		private static void searchVehicle1(ListVehicle<Vehicle> list) {
//			System.out.println("Nhap Id Phuong tien muon tim:");
//			Integer newID = Integer.parseInt(sc.nextLine());
//			//System.out.println((list.searchVehicle(newID)).toString());
//			form();
//			Vehicle v = list.searchVehicle(newID);
//	        if (v != null) {
//	            displayAgain(v);
//	        } else {
//	            System.out.println("No vehicle found with this ID.");
//	        }
//		}
		
		private static void searchVehicle2(ListVehicle<Vehicle> list) {
	        String newType = getStringInput("Nhập Kiểu Phương tiện muốn tìm: ");
	        List<Vehicle> results = ((VehicleImpls) list).searchVehicleType(newType);
	        if (results.isEmpty()) {
	            System.out.println("Không có gì cả!!!!");
	        } else {
	        	System.out.println("Size: "+results.size());
	            form();
	            for (Vehicle v : results) {
	                displayAgain(v);
	            }
	        }
	    }
		
//		private static void searchVehicle2(ListVehicle<Vehicle> list) {
//		    System.out.println("Nhập Kiểu Phương tiện muốn tìm:");
//		    String newtype = sc.nextLine();
//		    List<Vehicle> results = ((VehicleImpls) list).searchVehicle(newtype); 
//		    if (results.isEmpty()) {
//		        System.out.println("Không có gì cả!!");
//		    } else {
//		    	form();
//		        for (Vehicle v : results) {
//		            displayAgain(v);x`
//		        }
//		    }
//		}

		private static void removeVehicle1(ListVehicle<Vehicle> list) {
	        Integer newID = getIntegerInput("Nhap id phuong tien muon xoa: ",0,Integer.MAX_VALUE);
	        System.out.println("Ban that su muon xoa phong? \n" +
	                "1) De dong y \n" +
	                "phim bat ky de huy..");
	        int x = Integer.parseInt(sc.nextLine());
	        if (x == 1) {
	            list.removeVehicle(newID);
	        } else {
	            System.out.println("Ban da huy thao tac xoa phong!");
	        }
	    }
		
//		private static void removeVehicle1(ListVehicle<Vehicle> list) {
//			System.out.println("Nhap id phuong tien muon xoa:");
//			Integer newID = Integer.parseInt(sc.nextLine());
//			System.out.println("Ban that su muon xoa phong?: \n"
//					+ "1) De dong y. \n"
//					+ "phim bat ky de huy.\n");
//			int x = Integer.parseInt(sc.nextLine());
//			if(x ==1) {
//				list.removeVehicle(newID);
//			}else {
//				System.out.println("Ban da huy thao tac xoa phong!");
//			}
//			return list;
//		}



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
				bike.setColour(getStringInput("Nhập màu sắc"));
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
	            motor.setColour(getStringInput("Nhập màu sắc"));
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
				car.setColour(getStringInput("Nhập màu sắc"));
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
				truck.setColour(getStringInput("Nhập màu sắc:"));
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
				coach.setColour(getStringInput("Nhập màu sắc"));
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
