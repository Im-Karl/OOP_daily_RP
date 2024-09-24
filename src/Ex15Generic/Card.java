package Ex15Generic;

public class Card 
{
	private int face;
	private int suit;
public Card() {
	this.face = (int)(Math.random()*4);
	this.suit = (int)(Math.random()*13);
	}
	public int getFace() {
		return face;
	}
	public void setFace(int face) 
	{
		this.face = face;
	}
	public int getSuit() 
	{
		return suit;
		}
	public void setSuit(int suit) {
		this.suit = suit;
	}
	public boolean equals(Object obj) {
		Card c = (Card)obj;
		return (this.suit == c.getSuit() && this.face == 
		c.getFace());
		}
		// Ham override 
		public String toString() 
		{
		String ret = "";
		switch(suit)
		{
		case 0: ret = "At";break;
		case 1: ret = "Hai";break;
		case 2: ret = "Ba";break;
		case 3: ret = "Bon";break;
		case 4: ret = "Nam";break;
		case 5: ret = "Sau";break;
		case 6: ret = "Bay";break;
		case 7: ret = "Tam";break;
		case 8: ret = "Chin";break;
		case 9: ret = "Muoi";break;
		case 10: ret = "J";break;
		case 11: ret = "Q";break;
		case 12: ret = "K";break;
		}
		switch(face)
		{
		case 0: ret += " Co";break;
		case 1: ret += " Ro";break;
		case 2: ret += " Chuon";break;
		case 3: ret += " Bich";break;
		}
		return ret;
	}
}
