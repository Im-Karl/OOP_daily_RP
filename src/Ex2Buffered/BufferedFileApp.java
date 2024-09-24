package Ex2Buffered;

import java.io.*;
public class BufferedFileApp 
{
public static void main(String args[]) throws IOException
{
 BufferedInputStream bStream = new BufferedInputStream(
 new FileInputStream("D:\\OOP_dailly\\src\\Ex2Buffered\\yourfile.txt"));
 int ch=0;
 while ((ch=bStream.read())!= -1)
 {
 System.out.print((char)ch);
 }
 bStream.close();
}
} 