package Ex14Generic;

public class EVDictionaryTest
{
public static void main(String[] args) 
{
EVDictionary dic = new EVDictionary();
for(int i=1; i<10; i++)
{
dic.addWord(new EVWordClass("Word" + i, "", "Tu thu " + 
i, ""));
}
System.out.println(dic);
//Them tu
EVWordClass w = new EVWordClass("Word2", "", "Tu thu ", 
"");
if(!dic.addWord(w))
System.out.println("Khong them duoc!");
//Tra tu
EVWordClass l = dic.lookup("word2");
if(l != null)
System.out.println(l.toString());
}
}