package Ex2Generic;

class TwoGenerics<T, V> 
{
 T ob1;
 V ob2;
 TwoGenerics(T o1, V o2) 
 {
 ob1 = o1;
 ob2 = o2;
 }
 void showTypes() 
 {
 System.out.println("Loai cua T la "
 + ob1.getClass().getName());
 System.out.println("Loai cua V la "
 + ob2.getClass().getName());
 }
 T getob1() 
 {
 return ob1;
 }
 V getob2() 
 {
 return ob2;
 }
}
