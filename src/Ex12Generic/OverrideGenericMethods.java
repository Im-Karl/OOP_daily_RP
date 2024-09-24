package Ex12Generic;

class Gen<T> 
{ 
 T ob;
 Gen(T o) 
 { 
 ob = o; 
 } 
 T getObject() 
 { 
 System.out.println("Gen's getObject(): " );
 return ob; 
 } 
} 
class Gen2<T> extends Gen<T> 
{
 Gen2(T o) 
 {
 super(o);
 }
 T getObject() 
 { 
 System.out.println("Gen2's getObject(): "+ob);
 return ob; 
 } 
}
public class OverrideGenericMethods
{
 public static void main(String[] arg)
 {
 Gen<Integer> intObject = new Gen<Integer>(88); 
 Gen2<Long> longObject = new Gen2<Long>(99L); 
 
 intObject.getObject();
 longObject.getObject();
 }
 
}
// phía dưới không in ra gì bởi vì không return được

//class Gen<T> 
//{ 
// T ob; 
// 
// Gen(T o) 
// { 
// ob = o; 
// } 
// 
// T getObject() 
// { 
// return ob; 
// } 
//} 
//class Gen2<T> extends Gen<T> 
//{ 
// Gen2(T o) 
// { 
// super(o); 
// } 
//} 
//public class OverrideGenericMethods { 
// public static void main(String args[]) 
// { 
// Gen<Integer> intObject = new Gen<Integer>(88); 
// Gen2<Long> longObject = new Gen2<Long>(99L); 
// //longObject = (Gen2<Long>)intObject;
// } 
//}

