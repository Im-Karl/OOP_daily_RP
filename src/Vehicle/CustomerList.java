package Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CustomerList extends ArrayList<Customer> {
	
	private List<Customer> customerlist;
	public CustomerList() {
		customerlist = new ArrayList<Customer>();
	}
	public CustomerList(List<Customer> list) {
		this.customerlist = list;
	}
	public boolean  addCustomer(Customer c) {
	    boolean exists = false;

	    for (Customer customer : customerlist) {
	        if (customer.getIdCustomer() == c.getIdCustomer()) {
	            exists = true;
	            if (customer.getName().equalsIgnoreCase(c.getName())) {
	                System.out.println("Khách hàng đã từng mua hàng.");
	                customerlist.add(c); 
	                return true;
	            } else {
	                System.out.println("Không thể thêm khách hàng bởi vì đã tồn tại ID nhưng không trùng tên.");
	                return false;
	            }
	        }
	    }
	    if (!exists) {
	        customerlist.add(c);
	        System.out.println("Khách hàng mới!!!");
	        return true;
	    }
	    return false;
	}
	
	public List<Customer> getCustomersList() {
        return customerlist;
    }
	
	public Customer searchCustomer(Integer id) {
		for(Customer v : customerlist) {
			if(v.getIdCustomer().equals(id)) {
				return v; 
			}
		}
		return null;
	}
	public void removeCustomer(Integer id) {
		for(Customer v : customerlist) {
			if(v.getIdCustomer().equals(id)) {
				customerlist.remove(v);
				System.out.println("Delete successful");
			}else {
				System.out.println("Not containt this id in list");
			}
		}
	}
	public void sortCustomerWithID() {
		customerlist.sort((r1,r2)-> (r1.getIdCustomer().compareTo(r2.getIdCustomer())));
	}
//	public void sortCustomerWithPrice() {
//		customerlist.sort((r1,r2)-> (r1.getIdCustomer().compareTo(r2.getPrice())));
//	}
	public List<Customer> displayCustomer() {
	    if (customerlist.isEmpty()) {
	        System.out.println("List is empty!");
	    } else {
	    	System.out.printf("%-4s %-20s %-10s %-30s%n", "ID", "Name", "IDVehicle", "Address");
	        System.out.println("-------------------------------------------------------------------------------");
	        for (Customer v : customerlist) {
	            System.out.printf("%-4s %-20s %-10s %-30s%n", 
	                v.getIdCustomer(), v.getName(), v.getIdVehicle(), v.getDiaChi());
	        }
	    }
	    return customerlist;
	}
	public Customer updateCustomer(Integer id) {
	        for (Customer c : customerlist) {
	            if (c.getIdCustomer().equals(id)) {
	                return c; 
	            }
	        }
	        return null; 
	    }
	
	public int size() {
		return customerlist.size();
	}

	public void clearAll() {
		customerlist.clear();
	}
	
	public List<Customer> countCustomer() {
	    List<Customer> idcustomer = new LinkedList<>();
	    Set<Integer> seenIds = new HashSet<Integer>(); 

	    for (Customer c : customerlist) {
	        Integer id = c.getIdCustomer();
	        
	        if (!seenIds.contains(id)) {
	            seenIds.add(id); 
	            idcustomer.add(c);
	        }
	    }

	    return idcustomer;
	}
	
	
	public List<Customer> eliteCustomers() {
	    List<Customer> eliteCustomer = new LinkedList<>();
	    Map<Integer, Integer> idCount = new HashMap<>();

	    // Đếm số lần xuất hiện của mỗi ID
	    for(Customer c : customerlist) {
	    	Integer id = c.getIdCustomer();
	    	idCount.put(id, idCount.getOrDefault(id, 0) + 1);
	    }
	    for(Customer c : customerlist) {
	    	if(idCount.get(c.getIdCustomer())>=3) {
	    		eliteCustomer.add(c);
	    	}
	    }
	    return eliteCustomer;
	}
	public void removeCustomerByVehicleId(Integer idVehicle) {
	    Iterator<Customer> iterator = customerlist.iterator(); // Giả sử customerlist là một Collection<Customer>

	    while (iterator.hasNext()) {
	        Customer c = iterator.next();
	        if (c.getIdVehicle().equals(idVehicle)) {
	            iterator.remove(); // Sử dụng iterator để xóa
	        }
	    }
	}
}
