package Ex1Generic;

class GenericClass<T> 
{
 T ob;
 GenericClass(T o) 
 {
 ob = o;
 }
 T getob() 
 {
 return ob;
 }
 void showType() 
 {
 System.out.println("Kieu cua T la " + 
ob.getClass().getName());
 }
}