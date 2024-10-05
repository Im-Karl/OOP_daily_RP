package Vehicle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;
public class MainTruocKhiSuaBiLoi {
	    public static Scanner sc = new Scanner(System.in);
	    private static ListVehicle<Vehicle> list;
	    private static VehicleHasBeenSold list2;
	    private static CustomerList customerList;
	    private static AccesoriesList accessorieslist;
	    private static CustomerBuyAccessoriesList customerList2;
	    public static void main(String[] args) {
	        list = new VehicleImpls();
	        FuelList fuellist = new FuelList();
	        StationList stationList = new StationList();
	        BrandList brandList = new BrandList();
	        PriceList priceList = new PriceList();
	        TyreList tyreList = new TyreList();
	        customerList = new CustomerList();
	        list2 = new VehicleHasBeenSold();
	        accessorieslist = new AccesoriesList();
	        customerList2 = new CustomerBuyAccessoriesList();
	        Integer choice;
	        do {
	            choice = displayMainMenu();
	            switch (choice) {
	                case 1 -> accessStore(list);
	                case 2 -> accessSoldVehicles(list2);
	                case 3 -> accessExpiredWarranty(list);
	                case 4 -> accessSalesRights(customerList,accessorieslist, customerList2); 
	                case 5 -> accessFuelList(fuellist);
	                case 6 -> accessBrandList(brandList);
	                case 7 -> accessStationList(stationList);
	                case 8 -> accessTyreList(tyreList);
	                case 9 -> accessAccessoriesList(accessorieslist);
	                case 0 -> System.out.println("Kết thúc chương trình. Cảm ơn bạn!");
	                default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
	            }
	        } while (choice != 0);
	    }

	    private static Integer displayMainMenu() {
	        System.out.println("-----Chào mừng đến với sự quản lý của Phan Anh Kiệt :)-----\n"
	                + "Vui lòng chọn một tuỳ chọn phía dưới nhé \n"
	                + "1) Truy cập vào danh sách cửa hàng\n"
	                + "2) Truy cập vào danh sách phương tiện đã bán\n"
	                + "3) Truy cập vào danh sách phương tiện hết bảo hành\n"
	                + "4) Truy cập vào quyền mua bán phương tiện\n"
	                + "5) Truy cập vào danh sách nhiên liệu\n"
	                + "6) Truy cập vào danh sách hãng xe\n"
	                + "7) Truy cập vào danh sách trạm xe\n"
	                + "8) Truy cập vào danh sách loại lốp\n"
	                + "9) Truy cập vào danh sách phụ kiện\n"
	                + "0) Để thoát chương trình\n");
	        return getIntegerInput("Chọn tuỳ chọn: ", 0, 9);
	    }

	    private static void accessStore(ListVehicle<Vehicle> list) {
	        Integer choose;
	        do {
	            choose = getIntegerInput("Bạn đang truy cập vào danh sách cửa hàng:\n"
	                    + "1) Thêm xe\n"
	                    + "2) Xóa xe\n"
	                    + "3) Hiển thị xe\n"
	                    + "4) Tìm xe (phương pháp 1)\n"
	                    + "5) Tìm xe (phương pháp 2)\n"
	                    + "6) Tìm xe (phương pháp 3)\n"
	                    + "7) Tìm xe (phương pháp 4)\n"
	                    + "8) Sắp xếp xe theo ID\n"
	                    + "9) Sắp xếp xe theo giá\n"
	                    + "10) Danh sách đủ tiêu chuẩn\n"
	                    + "11) Cập nhật xe\n"
	                    + "12) Kích thước danh sách\n"
	                    + "13) Xóa tất cả xe\n"
	                    + "0) Thoát\n", 0, 13);
	            handleStoreMenuChoice(choose, list);
	        } while (choose != 0);
	        System.out.println("Thoát truy cập thành công!!");
	    }
	    ////
	    private static void accessSalesRights(CustomerList customerList,AccesoriesList accessorieslist,CustomerBuyAccessoriesList customerList2) {
	        Integer choose;
	        do {
	            choose = getIntegerInput("Bạn đang truy cập vào quyền bán hàng:\n"
	                    + "1) Giao dịch:\n"
	                    + "2) Truy cập danh sách khách hàng\n"
	                    + "0) Thoát\n", 0, 2);
	            handleSalesRights(choose, customerList,accessorieslist,customerList2);
	        } while (choose != 0);
	        System.out.println("Thoát truy cập thành công!!");
	    }
	    ///
	    private static void handleSalesRights(Integer choose, CustomerList customerList,AccesoriesList accessorieslist,CustomerBuyAccessoriesList customerList2) {
	        switch (choose) {
	            case 1 -> Trade(customerList,accessorieslist);
	            case 2 -> accessCustomerList(customerList,customerList2);
	        }
	    }
	    ///Trade
	    private static void Trade(CustomerList customerList,AccesoriesList accessorieslist) {
	    	Integer choose;
	        do {
	            choose = getIntegerInput("Bạn đang truy cập vào mục Giao Dịch:\n"
	                    + "1) Thực hiện việc bán phương tiện\n"
	                    + "2) Bán bảo hiểm\n"
	                    + "3) Thu mua lại xe\n"
	                    + "4) Bán phụ kiện\n"
	                    + "0) Thoát\n", 0, 4);
	            handleTrade(choose, customerList,accessorieslist);
	        } while (choose != 0);
	        System.out.println("Thoát truy cập thành công!!");
		}

		private static void handleTrade(Integer choose, CustomerList customerList,AccesoriesList accessorieslist) {
			switch (choose) {
            case 1 -> carSale(customerList);
//            case 2 -> sellInsurance(customerList); //searchCustomer
            case 3 -> putTheVehicleIntoStorage(customerList); //removeCustomer
            case 4 -> sellingCarAccessories(customerList2,accessorieslist);
			}
		}
		
//		private static void sellingCarAccessories(CustomerBuyAccessoriesList customerList2,
//				AccesoriesList accessorieslist2) {
//		    accessorieslist.displayAccessory();
//		    Integer idCustomer = getIntegerInput("Nhập id khách hàng", 0, Integer.MAX_VALUE);
//		    String nameCustomer = getStringInput("Nhập tên khách hàng:");
//
//		    boolean customerFound = false;
//	        for (CustomerBuyAccessories customer : customerList2.getCustomerList()) {
//	            if (idCustomer.equals(customer.getIdCustomer())) {
//	                if (nameCustomer.equalsIgnoreCase(customer.getName())) {
//	                    customerFound = true; 
//	                } else {
//	                    System.out.println("ID đã tồn tại, nhưng tên không trùng khớp. Dừng việc mua phụ kiện.");
//	                    return; 
//	                }
//	            }
//	        }
//
//	        if (!customerFound) {
//	            System.out.println("Khách hàng không tồn tại! V");
//	        }
//
//		    Map<String, Integer> newlist = new HashMap<>(accessorieslist.getAccessoriesList());
//		    String name = getStringInput("Vui lòng chọn phụ kiện bạn muốn mua");
//
//		    if (newlist.containsKey(name)) {
//		        Integer availableQuantity = newlist.get(name);
//		        Integer num = getIntegerInput("Nhập số lượng muốn mua", 0, availableQuantity);
//		        accessorieslist.buyAccessories(name, num);
//		    } else {
//		        System.out.println("Phụ kiện không tồn tại trong danh sách.");
//		    }
//		}
		
		private static void sellingCarAccessories(CustomerBuyAccessoriesList customerList2, AccesoriesList accessorieslist) {
		    accessorieslist.displayAccessory();
		    
		    Integer idCustomer = getIntegerInput("Nhập id khách hàng: ", 0, Integer.MAX_VALUE);
		    String nameCustomer = getStringInput("Nhập tên khách hàng: ");

		    checkCustomer(customerList2, idCustomer, nameCustomer);
		    
		}

		private static void checkCustomer(CustomerBuyAccessoriesList customerList2, Integer idCustomer, String nameCustomer) {
		    boolean customerExists = false; 
		    boolean nameMatches = false; 

		    for (CustomerBuyAccessories customer : customerList2.getCustomerListAcc()) {
		        if (idCustomer.equals(customer.getIdCustomer())) {
		            customerExists = true;
		            
		            if (nameCustomer.equalsIgnoreCase(customer.getName())) {
		                nameMatches = true; 
		                System.out.println("Khách hàng đã từng mua hàng ở đây. ");
		                purchaseAccessory(accessorieslist, idCustomer, nameCustomer);
		                return; 
		            }
		        }
		    }

		    if (customerExists) {
		        if (!nameMatches) {
		            System.out.println("ID đã tồn tại, nhưng tên không trùng khớp. Dừng việc mua phụ kiện.");
		            return; 
		        }
		    } else {
		        System.out.println("Khách hàng mới!");
		        purchaseAccessory(accessorieslist, idCustomer, nameCustomer);
		    }
		}



		private static void purchaseAccessory(AccesoriesList accessorieslist, Integer idCustomer, String nameCustomer) {
		    Map<String, Integer> newlist = new HashMap<>(accessorieslist.getAccessoriesList());
		    String name = getStringInput("Vui lòng chọn phụ kiện bạn muốn mua: ");

		    if (newlist.containsKey(name)) {
		        Integer availableQuantity = newlist.get(name);
		        Integer num = getIntegerInput("Nhập số lượng muốn mua: ", 0, availableQuantity);
		        accessorieslist.buyAccessories(name, num);
		        customerList2.addCustomer(idCustomer, nameCustomer, name, num);
		    } else {
		        System.out.println("Phụ kiện không tồn tại trong danh sách.");
		    }
		}


		private static void putTheVehicleIntoStorage(CustomerList customerList) {
		    Integer newID = getIntegerInput("Nhập id của người bán: ", 0, Integer.MAX_VALUE);
		    List<Customer> newlist = customerList.getCustomersList();
		    if (newlist.isEmpty()) {
		        System.out.println("Danh sách xe thu mua trống!");
		        return; 
		    }

		    boolean customerFound = false; 
		    for (Customer c : newlist) {
		        if (c.getIdCustomer().equals(newID)) {
		            customerFound = true; 
		            processVehiclePurchase(c);
		            break; 
		        }
		    }

		    if (!customerFound) {
		        System.out.println("Không tìm thấy khách hàng với ID: " + newID);
		    }
		}

		private static void processVehiclePurchase(Customer c) {
		    Integer idVehicle;
		    boolean vehicleFound;

		    do {
		        idVehicle = getIntegerInput("Nhập id phương tiện để mua lại", 0, Integer.MAX_VALUE);
		        vehicleFound = false;

		        for (Vehicle vehicle : list2.getAllVehicles()) { 
		            if (vehicle.getId().equals(idVehicle)) {
		                vehicleFound = true;

		                System.out.println("Đã tìm thấy phương tiện với ID: " + idVehicle);
		                if (getConfirmation("Bạn có muốn mua phương tiện này không? (Có/Không)")) {
		                    list.addVehicle(vehicle);
		                    System.out.println("Chạy add list1");
		                    list2.removeVehicle(vehicle.getId()) ;// Xóa khỏi list2
		                    System.out.println("Chạy remove list2");
		                    customerList.removeCustomerByVehicleId(idVehicle);
		                    System.out.println("Chạy add customerlist");
		                    System.out.println("Mua thành công phương tiện với ID: " + idVehicle);
		                } else {
		                    System.out.println("Bạn đã hủy việc mua bán.");
		                }
		                break;
		            }
		        }

		        if (!vehicleFound) {
		            System.out.println("Không tìm thấy phương tiện với ID: " + idVehicle + ". Vui lòng nhập lại.");
		        }

		    } while (!vehicleFound);
		}

		private static boolean getConfirmation(String message) {
		    System.out.println(message);
		    String response = sc.nextLine().trim().toLowerCase(); // Giả định bạn có một scanner để nhận đầu vào
		    return response.equals("có");
		}

		private static void carSale(CustomerList customerList) {
			Integer choice = getIntegerInput("Please choose the type of vehicle\n"
	                + "0) Thoát\n"
	                + "1) BikeCycle\n"
	                + "2) MotorBike\n"
	                + "3) Car\n"
	                + "4) Truck\n"
	                + "5) Coach\n", 0, 5);
	        Customer customer = createCustomer(choice);
		}

		private static Customer createCustomer(Integer choice) {
			Customer customer = null;
	        switch (choice) {
	            case 1 -> {
	            	handleBuyBike();
	            }
	            case 2 -> {
	            	handleBuyMotorBike();
	            }
	            case 3 -> {
	            	handleBuyCar();
	            }
	            case 4 -> {
	            	handleBuyTruck();
	            }
	            case 5 -> {
	            	handleBuyCoach();
	            }
	        }
	        return customer;
		}
		
		
		private static void handleBuyCoach() {
			List<Vehicle> coachResults = searchCoach(list);
			Integer id;
			if (coachResults.isEmpty()) {
		        return; 
		    }else {
		    	while (true) {
			        id = getIntegerInput("Vui lòng nhập id xe muốn mua: ",0,Integer.MAX_VALUE);
			        boolean idFound = false;
			        for(Vehicle v: coachResults) {
						if(v.getId().equals(id)) {
							buy(v); 
							idFound = true;
							break;
						} 
			        }
			        if (!idFound) {
			            System.out.println("ID không tồn tại. Vui lòng nhập lại.");
			        } else {
			            break;
			        }
		    	}	
		    }
		}

		private static void handleBuyTruck() {
			List<Vehicle> truckResults = searchTruck(list);
			Integer id;
			if (truckResults.isEmpty()) {
		        return; 
		    }else {
		    	while (true) {
			        id = getIntegerInput("Vui lòng nhập id xe muốn mua: ",0,Integer.MAX_VALUE);
			        boolean idFound = false;
			        for(Vehicle v: truckResults) {
						if(v.getId().equals(id)) {
							buy(v); 
							idFound = true;
							break;
						} 
			        }
			        if (!idFound) {
			            System.out.println("ID không tồn tại. Vui lòng nhập lại.");
			        } else {
			            break;
			        }
		    	}	
		    }
		}

		private static void handleBuyCar() {
			List<Vehicle> carResults = searchCar(list);
			Integer id;
			if (carResults.isEmpty()) {
		        return; 
		    }else {
		    	while (true) {
			        id = getIntegerInput("Vui lòng nhập id xe muốn mua: ",0,Integer.MAX_VALUE);
			        boolean idFound = false;
			        for(Vehicle v: carResults) {
						if(v.getId().equals(id)) {
							buy(v); 
							idFound = true;
							break;
						} 
			        }
			        if (!idFound) {
			            System.out.println("ID không tồn tại. Vui lòng nhập lại.");
			        } else {
			            break;
			        }
		    	}	
		    }
		}

		private static void handleBuyMotorBike() {
			List<Vehicle> motorResults = searchMotorBike(list);
			Integer id;
			if (motorResults.isEmpty()) {
		        return; 
		    }else {
		    	while (true) {
			        id = getIntegerInput("Vui lòng nhập id xe muốn mua: ",0,Integer.MAX_VALUE);
			        boolean idFound = false;
			        for(Vehicle v: motorResults) {
						if(v.getId().equals(id)) {
							buy(v); 
							idFound = true;
							break;
						} 
			        }
			        if (!idFound) {
			            System.out.println("ID không tồn tại. Vui lòng nhập lại.");
			        } else {
			            break;
			        }
		    	}	
		    }
		}

		private static void handleBuyBike() {
			List<Vehicle> bikeResults = searchBike(list);
			Integer id;
			if (bikeResults.isEmpty()) {
		        return; 
		    }else {
		    	while (true) {
			        id = getIntegerInput("Vui lòng nhập id xe muốn mua: ",0,Integer.MAX_VALUE);
			        boolean idFound = false;
			        for(Vehicle v: bikeResults) {
						if(v.getId().equals(id)) {
							buy(v); 
							idFound = true;
							break;
						} 
			        }
			        if (!idFound) {
			            System.out.println("ID không tồn tại. Vui lòng nhập lại.");
			        } else {
			            break;
			        }
		    	}	
		    }
		}	
		
			
		private static void buy(Vehicle v) {
			form();
		    displayAgain(v);
			Integer option = getIntegerInput("Bạn thực sự muốn mua xe này?\n"
					+ "1) Để đồng ý!\n"
					+ "0) Để huỷ  ",0,1);
		    if(option==1) {
		    	boolean added = buyVehicleForCustomer(customerList, v.getId());
		    	if (added) {
		    		list2.addVehicle(v);
			    	list.removeVehicle(v.getId());
			    	System.out.println("Bạn đã mua thành công!");
		    	}
		    }else {
		    	System.out.println("Bạn đã huỷ thao tác mua xe!");
		    }
		}

		private static List<Vehicle> searchBike(ListVehicle<Vehicle> list) {
	        List<Vehicle> results = ((VehicleImpls) list).searchVehicleType("Xe Dap");
	        if (results.isEmpty()) {
	            System.out.println("Không có gì cả!!!!");
	        } else {
	        	System.out.println("Size: "+results.size());
	            form();
	            for (Vehicle v : results) {
	                displayAgain(v);
	                
	            }
	        }
	        return results;
	    }
		
		private static List<Vehicle> searchMotorBike(ListVehicle<Vehicle> list) {
	        List<Vehicle> results = ((VehicleImpls) list).searchVehicleType("Xe May");
	        if (results.isEmpty()) {
	            System.out.println("Không có gì cả!!!!");
	        } else {
	        	System.out.println("Size: "+results.size());
	            form();
	            for (Vehicle v : results) {
	                displayAgain(v);
	            }
	        }
	        return results;
	    }
		private static List<Vehicle> searchCar(ListVehicle<Vehicle> list) {
	        List<Vehicle> results = ((VehicleImpls) list).searchVehicleType("O To");
	        if (results.isEmpty()) {
	            System.out.println("Không có gì cả!!!!");
	        } else {
	        	System.out.println("Size: "+results.size());
	            form();
	            for (Vehicle v : results) {
	                displayAgain(v);
	            }
	        }
	        return results;
	    }
		
		private static List<Vehicle> searchTruck(ListVehicle<Vehicle> list) {
	        List<Vehicle> results = ((VehicleImpls) list).searchVehicleType("Xe Tai");
	        if (results.isEmpty()) {
	            System.out.println("Không có gì cả!!!!");
	        } else {
	        	System.out.println("Size: "+results.size());
	            form();
	            for (Vehicle v : results) {
	                displayAgain(v);
	            }
	        }
	        return results;
	    }
		
		private static List<Vehicle> searchCoach(ListVehicle<Vehicle> list) {
	        List<Vehicle> results = ((VehicleImpls) list).searchVehicleType("Xe Khach");
	        if (results.isEmpty()) {
	            System.out.println("Không có gì cả!!!!");
	        } else {
	        	System.out.println("Size: "+results.size());
	            form();
	            for (Vehicle v : results) {
	                displayAgain(v);
	            }
	        }
	        return results;
	    }
		
		public static boolean buyVehicleForCustomer(CustomerList customerList, Integer id) {
			//Bro xem lại tại cái đếm là đếm id, nên id trùng vẫn được chứ
			Customer customer = new Customer() {
			};
			initializeCustomer(customer);
			customer.setIdVehicle(id);
			boolean added = customerList.addCustomer(customer);
		    return added;
		}
		
		private static void initializeCustomer(Customer customer) {
	        customer.setIdCustomer(getIntegerInput("Nhập mã ID: ", 0, Integer.MAX_VALUE));
	        customer.setName(getStringInput("Nhập Tên Khách hàng: "));
	        customer.setDiaChi(getStringInput("Nhập địa chỉ "));
	    }
		
		private static void accessCustomerList(CustomerList customerList,CustomerBuyAccessoriesList customerList2) {
			Integer choose;
	        do {
	            choose = getIntegerInput("Bạn đang truy cập vào danh sách khách hàng:\n"
	                    + "1) Hiển thị khách hàng\n"
	                    + "2) Sắp xếp theo ID\n"
	                    + "3) Cập nhật khách hàng\n"
	                    + "4) Xoá khách khỏi danh sách\n"
	                    + "5) Tìm khách hàng với ID\n"
	                    + "6) Tìm danh sách khách hàng ưu tú\n"
	                    + "7) Kích thước danh sách\n"
	                    + "8) Số lượng khách hàng\n"
	                    + "9) Xóa tất cả khách hàng\n"
	                    + "10) Hiển thị danh sách khách hàng mua phụ kiện.\n"
	                    + "0) Thoát\n", 0, 10);
	            handleCustomerList(choose, customerList,customerList2);
	        } while (choose != 0);
	        System.out.println("Thoát truy cập thành công!!");
		}

		private static void handleCustomerList(Integer choose, CustomerList customerList,CustomerBuyAccessoriesList customerList2) {
			switch (choose) {
            case 1 -> customerList.displayCustomer();
            case 2 -> { customerList.sortCustomerWithID(); customerList.displayCustomer(); }
         // case 3 -> updateCustomer(customerList);
//            case 4 -> removeCustomer(customerList); //removeCustomer
            case 5 -> searchCustomerID(customerList); //searchCustomer
            case 6 -> eliteCustomersList(customerList);
            case 7 -> System.out.println("Kích thước danh sách: "+customerList.size());
            case 8 -> System.out.println("Số lượng khách hàng: "+customerList.countCustomer().size());
            case 9 -> customerList.clearAll();
            case 10 -> {customerList2.displayCustomers(); System.out.println("Hiển thị danh sách khách hàng mua phụ kiện: ");}
			}
		}

		private static void eliteCustomersList(CustomerList customerList) {
			List<Customer> newlist = customerList.eliteCustomers();
			if(newlist.isEmpty()) {
				System.out.println("Rất tiếc hiện tại không có khách hàng ưu tú nào!");
			}else {
				formForCustomer();
				for(Customer c: newlist) {
					displayAgain(c);
				}
			}
		}

		private static void searchCustomerID(CustomerList customerList) {
			Integer newID = getIntegerInput("Enter customer ID to search: ",0,Integer.MAX_VALUE);
	        formForCustomer();
	        Customer v = customerList.searchCustomer(newID);
	        if (v != null) {
	            displayAgain(v);
	        } else {
	            System.out.println("No customer found with this ID.");
	        }
		}

		private static void handleStoreMenuChoice(Integer choose, ListVehicle<Vehicle> list) {
	        switch (choose) {
	            case 1 -> addVehicle(list);
	            case 2 -> removeVehicle1(list);
	            case 3 -> list.displayVehicle();
	            case 4 -> searchVehicle1(list);
	            case 5 -> searchVehicle2(list);
	            case 6 -> searchVehicle3(list);
	            case 7 -> searchVehicle4(list);
	            case 8 -> { list.sortVehicleWithID(); list.displayVehicle(); }
	            case 9 -> { list.sortVehicleWithPrice(); list.displayVehicle(); }
	            case 10 -> listQualified(list);
	            case 11 -> updateVehicle(list);
	            case 12 -> System.out.println("Số lượng trong cửa hàng: " + list.size());
	            case 13 -> list.clearAll();
	        }
	    }

	    private static void accessSoldVehicles(VehicleHasBeenSold list2) {
	        Integer choose;
	        do {
	            choose = getIntegerInput("Bạn đang truy cập vào danh sách đã bán:\n"
	                    + "1) Hiển thị xe\n"
	                    + "2) Sắp xếp theo giá\n"
	                    + "3) Sắp xếp theo ID\n"
	                    + "4) Tìm xe (phương pháp 1)\n"
	                    + "5) Tìm xe (phương pháp 2)\n"
	                    + "6) Tìm xe (phương pháp 3)\n"
	                    + "7) Tìm xe (phương pháp 4)\n"
	                    + "8) Danh sách đủ tiêu chuẩn\n"
	                    + "9) Cập nhật xe\n"
	                    + "10) Kích thước danh sách\n"
	                    + "11) Xóa tất cả xe\n"
	                    + "0) Thoát\n", 0, 11);
	            handleSoldMenuChoice(choose, list2);
	        } while (choose != 0);
	        System.out.println("Thoát truy cập thành công!!");
	    }

	    private static void handleSoldMenuChoice(Integer choose, VehicleHasBeenSold list2) {
	        switch (choose) {
	            case 1 -> list2.displayVehicle();
	            case 2 -> { list2.sortVehicleWithPrice(); list2.displayVehicle(); }
	            case 3 -> { list2.sortVehicleWithID(); list2.displayVehicle(); }
	            case 4 -> searchVehicle1ForSale(list2);
	            case 5 -> searchVehicle2ForSale(list2);
	            case 6 -> searchVehicle3ForSale(list2);
	            case 7 -> searchVehicle4ForSale(list2);
	            case 8 -> listQualified(list2);
	            case 9 -> updateVehicle(list2); // Update only insurance for sold vehicles
	            case 10 -> System.out.println("Số lượng đã bán: " + list2.size());
	            case 11 -> list2.clearAll();
	        }
	    }

	    private static void accessExpiredWarranty(ListVehicle<Vehicle> list) {
	        Integer choose;
	        do {
	            choose = getIntegerInput("Bạn đang truy cập vào danh sách hết thời gian bảo hành:\n"
	                    + "1) Hiển thị xe\n"
	                    + "2) Sắp xếp theo giá\n"
	                    + "3) Sắp xếp theo ID\n"
	                    + "4) Tìm xe (phương pháp 1)\n"
	                    + "5) Tìm xe (phương pháp 2)\n"
	                    + "6) Tìm xe (phương pháp 3)\n"
	                    + "7) Tìm xe (phương pháp 4)\n"
	                    + "8) Danh sách đủ tiêu chuẩn\n"
	                    + "9) Cập nhật xe\n"
	                    + "10) Kích thước danh sách\n"
	                    + "11) Xóa tất cả xe\n"
	                    + "0) Thoát\n", 0, 11);
	            handleExpiredWarrantyMenuChoice(choose, list);
	        } while (choose != 0);
	        System.out.println("Thoát truy cập thành công!!");
	    }

	    private static void handleExpiredWarrantyMenuChoice(Integer choose, ListVehicle<Vehicle> list) {
	        switch (choose) {
	            case 1 -> list.displayVehicle();
	            case 2 -> { list.sortVehicleWithPrice(); list.displayVehicle(); }
	            case 3 -> { list.sortVehicleWithID(); list.displayVehicle(); }
	            case 4 -> searchVehicle1(list);
	            case 5 -> searchVehicle2(list);
	            case 6 -> searchVehicle3(list);
	            case 7 -> searchVehicle4(list);
	            case 8 -> listQualified(list);
	            case 9 -> updateVehicle(list); // Update only insurance for expired warranty vehicles
	            case 10 -> System.out.println("Kích thước danh sách: " + list.size());
	            case 11 -> list.clearAll();
	        }
	    }

	    private static void accessFuelList(FuelList fuellist) {
	        Integer choose;
	        do {
	            choose = getIntegerInput("Bạn đang truy cập vào danh sách nhiên liệu:\n"
	                    + "1) Thêm nhiên liệu\n"
	                    + "2) Xóa nhiên liệu\n"
	                    + "3) Hiển thị nhiên liệu\n"
	                    + "0) Thoát\n", 0, 3);
	            handleFuelMenuChoice(choose, fuellist);
	        } while (choose != 0);
	    }

	    private static void handleFuelMenuChoice(Integer choose, FuelList fuellist) {
	        switch (choose) {
	            case 1 -> addFuelList(fuellist);
	            case 2 -> removeFuelList(fuellist);
	            case 3 -> fuellist.displayFuel();
	            default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
	        }
	    }

	    private static void accessBrandList(BrandList brandList) {
	        Integer choose;
	        do {
	            choose = getIntegerInput("Bạn đang truy cập vào danh sách hãng xe:\n"
	                    + "1) Thêm hãng\n"
	                    + "2) Xóa hãng\n"
	                    + "3) Hiển thị hãng\n"
	                    + "0) Thoát\n", 0, 3);
	            handleBrandMenuChoice(choose, brandList);
	        } while (choose != 0);
	    }

	    private static void handleBrandMenuChoice(Integer choose, BrandList brandList) {
	        switch (choose) {
	            case 1 -> addBrandList(brandList);
	            case 2 -> removeBrandList(brandList);
	            case 3 -> brandList.displayBrand();
	            default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
	        }
	    }

	    private static void accessStationList(StationList stationList) {
	        Integer choose;
	        do {
	            choose = getIntegerInput("Bạn đang truy cập vào danh sách trạm xe:\n"
	                    + "1) Thêm trạm\n"
	                    + "2) Xóa trạm\n"
	                    + "3) Hiển thị trạm\n"
	                    + "0) Thoát\n", 0, 3);
	            handleStationMenuChoice(choose, stationList);
	        } while (choose != 0);
	    }

	    private static void handleStationMenuChoice(Integer choose, StationList stationList) {
	        switch (choose) {
	            case 1 -> addStationList(stationList);
	            case 2 -> removeStationList(stationList);
	            case 3 -> stationList.displayStation();
	            default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
	        }
	    }

	    private static void accessAccessoriesList(AccesoriesList accessorieslist) {
	        Integer choose;
	        do {
	            choose = getIntegerInput("Bạn đang truy cập vào danh sách loại lốp:\n"
	                    + "1) Thêm loại phụ kiện\n"
	                    + "2) Xóa loại phụ kiện\n"
	                    + "3) Hiển thị loại phụ kiện\n"
	                    + "0) Thoát\n", 0, 3);
	            handleTyreMenuChoice(choose, accessorieslist);
	        } while (choose != 0);
	    }
	    
	    
	    private static void handleTyreMenuChoice(Integer choose, AccesoriesList accessorieslist2) {
	    	switch (choose) {
            case 1 -> addAccessoriesList(accessorieslist2);
            case 2 -> removeAccessoriesList(accessorieslist2);
            case 3 -> accessorieslist2.displayAccessory();
            default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
	    	}
		}

		private static void addAccessoriesList(AccesoriesList accessorieslist2) {
			String name = getStringInput("Nhập tên phụ kiện muốn thêm: ");
			Integer num = getIntegerInput("Nhập số lượng muốn thêm: ", 0, Integer.MAX_VALUE);
			accessorieslist2.addAccessories(name, num);
		}

		private static void removeAccessoriesList(AccesoriesList accessorieslist2) {
			String name = getStringInput("Nhập tên phụ kiện muốn xoá");
			accessorieslist2.removeAccessories(name);
		}

		private static void accessTyreList(TyreList tyreList) {
	        Integer choose;
	        do {
	            choose = getIntegerInput("Bạn đang truy cập vào danh sách loại lốp:\n"
	                    + "1) Thêm loại lốp\n"
	                    + "2) Xóa loại lốp\n"
	                    + "3) Hiển thị loại lốp\n"
	                    + "0) Thoát\n", 0, 3);
	            handleTyreMenuChoice(choose, tyreList);
	        } while (choose != 0);
	    }

	    private static void handleTyreMenuChoice(Integer choose, TyreList tyreList) {
	        switch (choose) {
	            case 1 -> addTyreList(tyreList);
	            case 2 -> removeTyreList(tyreList);
	            case 3 -> tyreList.displayTyre();
	            default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
	        }
	    }

	    private static void addVehicle(ListVehicle<Vehicle> list) {
	        Integer choice = getIntegerInput("Please choose the type of vehicle\n"
	                + "1) BikeCycle\n"
	                + "2) MotorBike\n"
	                + "3) Car\n"
	                + "4) Truck\n"
	                + "5) Coach\n", 1, 5);
	        Vehicle vehicle = createVehicle(choice);
	        list.addVehicle(vehicle);
	        System.out.println("Add successful!!");
	    }

	    private static  Vehicle createVehicle(Integer choice) {
	        Vehicle vehicle = null;
	        switch (choice) {
	            case 1 -> {
	                BikeCycle bike = new BikeCycle();
	                initializeVehicle(bike);
	                bike.setType("Xe Dap");
	                bike.setTyre(getStringInput("Nhập loại lốp: "));
	                vehicle = bike;
	            }
	            case 2 -> {
	                MotorBike motor = new MotorBike();
	                initializeVehicle(motor);
	                motor.setType("Xe May");
	                motor.setFuel(getStringInput("Nhập nhiên liệu: "));
	                vehicle = motor;
	            }
	            case 3 -> {
	                Car car = new Car();
	                initializeVehicle(car);
	                car.setType("O To");
	                car.setFuel(getStringInput("Nhập nhiên liệu: "));
	                car.setSeat(getIntegerInput("Nhập số lượng ghế: ", 2, 7));
	                vehicle = car;
	            }
	            case 4 -> {
	                Truck truck = new Truck();
	                initializeVehicle(truck);
	                truck.setType("Xe Tai");
	                truck.setFuel(getStringInput("Nhập nhiên liệu: "));
	                truck.setWeight(getIntegerInput("Nhập tải trọng: ", 500, 30000));
	                vehicle = truck;
	            }
	            case 5 -> {
	                Coach coach = new Coach();
	                initializeVehicle(coach);
	                coach.setType("Xe Khach");
	                coach.setFuel(getStringInput("Nhập nhiên liệu: "));
	                coach.setSeat(getIntegerInput("Nhập số lượng ghế: ", 16, 46));
	                coach.setStation(getStringInput("Nhập trạm đến: "));
	                vehicle = coach;
	            }
	        }
	        return vehicle;
	    }

	    private static void initializeVehicle(Vehicle vehicle) {
	        vehicle.setId(getIntegerInput("Nhập mã ID: ", 0, Integer.MAX_VALUE));
	        vehicle.setBrand(getStringInput("Nhập thương hiệu: "));
	        vehicle.setSpeed(getIntegerInput("Nhập tốc độ: ", 10, 500));
	        vehicle.setColour(getStringInput("Nhập màu sắc: "));
	        vehicle.setPrice(getBigIntegerInput("Nhập giá tiền: ", BigInteger.valueOf(100000), BigInteger.valueOf(500000000000L)));
	    }
	    
	    public static void form() {
			System.out.printf("%-4s %-14s %-10s %-10s %-10s %-15s %-18s%n", "ID", "Brand", "Type","Colour",  "Speed (Km/h)", "Price (Dong)", "Details");
	        System.out.println("-------------------------------------------------------------------------------");
		}
	    public static void formForCustomer() {
	    	System.out.printf("%-4s %-20s %-10s %-30s%n", "ID", "Name", "IDVehicle", "Address");
	        System.out.println("-------------------------------------------------------------------------------");
	      }
	    
	    public static void displayAgain(Vehicle v) {
	        // In danh sách phương tiện
	        System.out.printf("%-4s %-14s %-10s %-15s %-10d %-7d %s%n", 
	                v.getId(), v.getBrand(), v.getType(),v.getColour(), v.getSpeed(), v.getPrice(), v.toString());
		}
	    public static void displayAgain(Customer c) {
	        // In danh sách phương tiện
	    	System.out.printf("%-4s %-20s %-10s %-30s%n", 
	                c.getIdCustomer(), c.getName(), c.getIdVehicle(), c.getDiaChi());
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

	    private static void removeVehicle1(ListVehicle<Vehicle> list) {
	        Integer newID = getIntegerInput("Nhap id phuong tien muon xoa: ",0,Integer.MAX_VALUE);
	        System.out.println("Ban that su muon xoa phong? \n" +
	                "1) De dong y \n" +
	                "phim bat ky de huy..");
	        int x = Integer.parseInt(sc.nextLine());
	        if (x == 1) {
	            list.removeVehicle(newID);
	            System.out.println("Delete successful");
	        } else {
	            System.out.println("Ban da huy thao tac xoa phuong tien!");
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
	    
	    private static void searchVehicle1ForSale(VehicleHasBeenSold list2) {
	        Integer newID = getIntegerInput("Enter vehicle ID to search: ",0,Integer.MAX_VALUE);
	        form();
	        Vehicle v = list2.searchVehicle(newID);
	        if (v != null) {
	            displayAgain(v);
	        } else {
	            System.out.println("No vehicle found with this ID.");
	        }
	    }

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
	    
	    private static void searchVehicle2ForSale(VehicleHasBeenSold list2) {
	        String newType = getStringInput("Nhập Kiểu Phương tiện muốn tìm: ");
	        List<Vehicle> results = ((VehicleHasBeenSold) list2).searchVehicleType(newType);
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
	    
	    private static void searchVehicle3ForSale(ListVehicle<Vehicle> list) {
			System.err.println("Nhập giá trị min: ");
			BigInteger min = sc.nextBigInteger();
			sc.nextLine();
			System.out.println("Nhập giá trị max");
			BigInteger max = sc.nextBigInteger();
			sc.nextLine();
	        List<Vehicle> results = ((VehicleHasBeenSold) list2).searchVehicle(min,max);
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
	    
	    private static void searchVehicle4ForSale(ListVehicle<Vehicle> list) {
			String newcolour = getStringInput("Nhập màu sắc muốn tìm:");
			List<Vehicle> result = ((VehicleHasBeenSold) list2).searchVehicleColor(newcolour);
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

	    private static void listQualified(ListVehicle<Vehicle> list) {
			List<Vehicle> newlist = list.listqualified();
			form();
			for(Vehicle v: newlist) {
				displayAgain(v);
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
}
