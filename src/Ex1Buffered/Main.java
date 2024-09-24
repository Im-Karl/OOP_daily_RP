package Ex1Buffered;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Nhập chuỗi vào đi:");
			String input = reader.readLine();
			
			String reversed = new StringBuilder(input).reverse().toString();
			
			System.out.println("Chuỗi sau khi đảo:" + reversed);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
