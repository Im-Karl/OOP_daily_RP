package Ex11Generic;

public class GenericStatsTest 
{
 public static void main(String args[]) 
 {
 Integer inums[] = { 1, 2, 3, 4, 5 }; 
 GenericStats<Integer> iob = new GenericStats<Integer>(inums);
 double v = iob.average();
 System.out.println("Trung binh cua iob " + v);
 Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
 GenericStats<Double> dob = new GenericStats<Double>(dnums);
 double w = dob.average();
 System.out.println("Trung binh cua dob " + w); 
 Float fnums[] = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F }; 
 GenericStats<Float> fob = new GenericStats<Float>(fnums);
 double x = fob.average(); 
 System.out.println("Trung binh cua fob " + x);
 System.out.print("Trung binh cua iob va dob ");
 if(iob.sameAvg(dob))
 {
	 System.out.println("giong nhau."); 
	 }
	 else
	 {
	 System.out.println("khac nhau."); 
	 }
	 
	 System.out.print("Trung binh cua iob va fob ");
	 if(iob.sameAvg(fob))
	 {
	 System.out.println("giong nhau."); 
	 }
	 else
	 {
	 System.out.println("khac nhau."); 
	 }
	 }
	}

