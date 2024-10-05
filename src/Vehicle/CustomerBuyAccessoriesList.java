package Vehicle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class CustomerBuyAccessoriesList extends ArrayList<CustomerBuyAccessories>{
    private List<CustomerBuyAccessories> customerList;

    public CustomerBuyAccessoriesList() {
        customerList = new ArrayList<>();
    }

//    public boolean addCustomer(Customer c) {
//    	boolean exists = false;
//        for (CustomerBuyAccessories existCustomer : customerList) {
//            if (existCustomer.getIdCustomer().equals(c.getIdCustomer())) {
//                exists = true;
//                if(existCustomer.getName().equalsIgnoreCase(c.getName())) {
//                	customerList.add(new CustomerBuyAccessories(c));
//                	return true;
//                }else {
//                	System.out.println("Không thể thêm khách hàng bởi vì đã tồn tại ID nhưng không trùng tên.");
//	                return false;
//                }
//            }
//            if (!exists) {
//            	customerList.add(new CustomerBuyAccessories(c));
//    	        System.out.println("Add successful!!");
//    	        return true;
//    	    }
//    	    return false;
//        }
//        customerList.add(new CustomerBuyAccessories(c));
//        System.out.println("Thêm thành công!!");
//        return true;
//    }
    
    public void addCustomer(Integer id, String name,  String accessory, Integer num) {
        CustomerBuyAccessories newCustomer = new CustomerBuyAccessories();
        newCustomer.setIdCustomer(id);
        newCustomer.setName(name);
        newCustomer.setAccessory(accessory);
        newCustomer.setNum(num);
        customerList.add(newCustomer);
    }


    public List<CustomerBuyAccessories> getCustomerListAcc() {
        return customerList;
    }

    public void displayCustomers() {
        if (customerList.isEmpty()) {
            System.out.println("Không có khách hàng nào!");
        } else {
            System.out.printf("%-4s %-20s %-20s %-20s%n", "ID", "Tên", "Phụ kiện", "Số lượng (cái)");
            System.out.println("-----------------------------------------------------");
            for (CustomerBuyAccessories c : customerList) {
                System.out.printf("%-4s %-20s %-20s %-20s%n", c.getIdCustomer(), c.getName(),  c.getAccessory(), c.getNum());
            }
        }
    }

}