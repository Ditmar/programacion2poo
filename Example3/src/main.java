import java.io.IOException;
import java.util.Scanner;

import myownread.MyReader;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyReader reader = new MyReader();
		System.out.println("Write a Integer Number");
		try {
			Integer number =  reader.readInt();
			System.out.println("The number have you input is " + number);
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("The function readInt only can read Integer numbers");
		}
		System.out.println("Write a Double Number");
		try {
			Double number =  reader.readDouble();
			System.out.println("The number have you input is " + number);
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("The function readDouble only can read Double numbers");
		}
		
	}

}
