package Ex15Generic;

public class CardTesting 
{
public static void main(String[] args) 
{
Card_Pack cp=new Card_Pack();
System.out.println(cp);
System.out.println("\nBAI SAU KHI XAO: \n");
cp.shuffleCardPack();
System.out.println(cp);
}
}
