package Ex2Generic;

public class TwoGenericsTest 
{
 public static void main(String args[]) 
 {
TwoGenerics<Integer, String> tgObj = 
new TwoGenerics<Integer, String>(88, "Generics");
 tgObj.showTypes();
 int v = tgObj.getob1();
 System.out.println("gia tri: " + v);
 String str = tgObj.getob2();
 System.out.println("gia tri: " + str);
 }
}
