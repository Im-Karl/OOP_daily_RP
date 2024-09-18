package Ex4;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Khai báo 2 tập hợp các số nguyên
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        
        // Nhập phần tử cho tập 1
        System.out.println("Nhập số phần tử cho tập 1:");
        int n1 = sc.nextInt();
        System.out.println("Nhập các phần tử của tập 1:");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }

        // Nhập phần tử cho tập 2
        System.out.println("Nhập số phần tử cho tập 2:");
        int n2 = sc.nextInt();
        System.out.println("Nhập các phần tử của tập 2:");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }

        // Hiển thị 2 tập hợp đã nhập
        System.out.println("Tập 1: " + set1);
        System.out.println("Tập 2: " + set2);

        // Tính hội (union) của 2 tập
        Set<Integer> unionSet = new TreeSet<>(set1); // copy tập 1
        unionSet.addAll(set2); // hội với tập 2
        System.out.println("Hội của 2 tập: " + unionSet);

        // Tính giao (intersection) của 2 tập
        Set<Integer> intersectionSet = new TreeSet<>(set1); // copy tập 1
        intersectionSet.retainAll(set2); // giao với tập 2
        System.out.println("Giao của 2 tập: " + intersectionSet);

        // Tính hiệu (difference) của 2 tập (set1 - set2)
        Set<Integer> differenceSet = new TreeSet<>(set1); // copy tập 1
        differenceSet.removeAll(set2); // trừ các phần tử có trong tập 2
        System.out.println("Hiệu của 2 tập (set1 - set2): " + differenceSet);

        sc.close();
    }
}
