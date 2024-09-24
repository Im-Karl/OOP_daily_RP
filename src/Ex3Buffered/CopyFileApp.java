package Ex3Buffered;

import java.io.*;
public class CopyFileApp 
{
public static void main(String args[]) throws IOException 
{
 if (args.length!=2) 
 {
 System.out.println("Usage : java CopyFileApp <SrcFile> <DestFile>");
 return;
 }
 String SourceFile=args[0]; // tập tin nguồn
 String DestFile =args[1]; // tập tin copy
 // Tạo bộ đệm đọc dữ liệu từ tập tin nguồn
 BufferedInputStream inFile = new BufferedInputStream(
 new
FileInputStream(SourceFile));
 // Lấy kích thước tập tin nguồn
 int FileSize = inFile.available();
 // Tạo bộ đệm ghi dữ liệu vào tập tin đích 
 BufferedOutputStream outFile = new BufferedOutputStream(
 new FileOutputStream(DestFile));
 // Chuyển dữ liệu
 int ch=0;
 while ((ch=inFile.read())!= -1)
 {
outFile.write(ch);
 }
 System.out.println(FileSize + " bytes da duoc copy xong.");
 
 inFile.close();
 outFile.close();
}
}