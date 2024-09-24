package Ex15Generic;

import java.util.ArrayList;
import java.util.Collections;

public class Card_Pack 
{
private ArrayList<Card> pack;
public Card_Pack() 
{
pack = new ArrayList<Card>();
int count =0;
do
{
Card c = new Card();
if(!pack.contains(c))
{
pack.add(c);
count ++;
}
}while(count<52);
}
public void shuffleCardPack()
{
Collections.shuffle(pack);
}
public String toString() 
{
String ret = "";
for(Card c:pack)
ret += c.toString() + "\n";
return ret;
}
}