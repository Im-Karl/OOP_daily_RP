package Vehicle;

import java.util.HashMap;
import java.util.Map;

public class AccesoriesList {
    private Map<String, Integer> accessorieslist = new HashMap<>(); 

    public void addAccessories(String accessory, Integer num) {
        if (accessorieslist.containsKey(accessory)) {
            Integer currentQuantity = accessorieslist.get(accessory);
            accessorieslist.put(accessory, currentQuantity + num);
            System.out.println("Cập nhật số lượng phụ kiện: " + accessory + ", Số lượng mới: " + (currentQuantity + num));
        } else {
            accessorieslist.put(accessory, num);
            System.out.println("Thêm mới phụ kiện: " + accessory + ", Số lượng: " + num);
        }
    }
    
    public void buyAccessories(String accessory, Integer num) {
        if (accessorieslist.containsKey(accessory)) {
            Integer currentQuantity = accessorieslist.get(accessory);
            if (num <= currentQuantity) {
                accessorieslist.put(accessory, currentQuantity - num);
                System.out.println("Đã mua " + num + " phụ kiện " + accessory + ". Số lượng còn lại: " + (currentQuantity - num));
            } else {
                System.out.println("Số lượng muốn mua vượt quá số lượng còn lại. Chỉ còn " + currentQuantity + " phụ kiện " + accessory + ".");
            }
        } else {
            System.out.println("Phụ kiện " + accessory + " không tồn tại trong danh sách.");
        }
    }
    
    public void removeAccessories(String accessory) {
        accessorieslist.remove(accessory);
        System.out.println("Xoá thành công "+accessory+".");
    }

    public Map<String, Integer> getAccessoriesList() {
        return accessorieslist;
    }

    public void displayAccessory() {
        if (accessorieslist.isEmpty()) {
            System.out.println("Danh sách phụ kiện trống!!");
        } else {
            System.out.printf("%-20s %-12s%n", "Phụ kiện", "Số lượng (cái)");
            System.out.println("---------------------------------------------------");
            for (Map.Entry<String, Integer> entry : accessorieslist.entrySet()) {
                System.out.printf("%-20s %-12d%n", entry.getKey(), entry.getValue());
            }
        }
    }
}
