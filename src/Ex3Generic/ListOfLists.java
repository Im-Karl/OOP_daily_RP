package Ex3Generic;

import java.util.ArrayList;
import java.util.List;
public class ListOfLists 
{
public static void main(String[] args) 
{
 List<String> listOfStrings = new ArrayList<String>();
 listOfStrings.add("Hello again");
 List<List<String>> listOfLists = 
 new ArrayList<List<String>>();
 listOfLists.add(listOfStrings);
 String s = listOfLists.get(0).get(0);
// tự thêm thông tin khác
 System.out.println(s); // ket qua "Hello again"
}
}
