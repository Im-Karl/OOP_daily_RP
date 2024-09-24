package Ex1Generic;
public class GenericClassTest 
{
 public static void main(String args[]) 
 {
 // Tao đối tượng cho GenericClass lưu trữ các số Integer.
 GenericClass<Integer> iOb = new GenericClass<Integer>(88);
 iOb.showType();
 // Không cần ép kiểu
 int v = iOb.getob();
 System.out.println("gia tri: " + v);
 // Tao đối tượng cho GenericClass lưu trữ các chuỗi String.
 GenericClass<String> strOb = new
GenericClass<String>("Generics Test");
 strOb.showType();
 String str = strOb.getob();
 System.out.println("gia tri: " + str);
 }
}

