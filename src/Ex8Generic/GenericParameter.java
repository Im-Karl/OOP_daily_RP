package Ex8Generic;

import java.util.ArrayList;
import java.util.List;
public class GenericParameter 
{
 public static <E> void printList (List<E> list) ///(List<?> list)
 {
 for (E element : list) 
 {
 System.out.println(element);
 }
 }
 public static void main(String[] args) 
 {
 List<String> list1 = new ArrayList<String>();
 list1.add ("Hello");
 list1.add ("World");
 printList (list1);
 List<Integer> list2 = new ArrayList<Integer>();
 list2.add(100);
 list2.add(200);
 printList(list2);
 }
}