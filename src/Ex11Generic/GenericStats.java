package Ex11Generic;
class GenericStats<T extends Number> 
{
 T[] nums;
 GenericStats(T[] obj){
	 nums = obj;
	 }
	 double average() 
	 {
	 double sum = 0.0;
	 for(int i=0; i < nums.length; i++)
	 {
	 sum += nums[i].doubleValue();
	 }
	 return sum / nums.length;
	 }
	 boolean sameAvg(GenericStats<?> ob) 
	 {
	 if(average() == ob.average()) 
	 return true;
	 return false;
	 }
} 