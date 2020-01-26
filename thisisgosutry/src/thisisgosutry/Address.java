package thisisgosutry;
import java.util.Scanner;
import java.io.*;


public class Address extends Person {

	public String input;
	
	public Address () {}
	
	public boolean readUserInput() {
	String st, city, prov, country, zip;
	Scanner user_input = new Scanner(System.in);

	System.out.println("");
	System.out.print("Street: ");
	st= user_input.nextLine();
	
	System.out.print("City: ");
	city= user_input.nextLine();	
	
	System.out.print("Provice: ");
	prov= user_input.nextLine();	
	
	System.out.print("Country: ");
	country= user_input.nextLine();
	
	System.out.print("Zip: ");
	zip= user_input.nextLine();
	
	String nextInput = user_input.next();
	input += nextInput;
	
		return true;	
	}	
	
	
	public String getInput() {
		return input;
	}
}
