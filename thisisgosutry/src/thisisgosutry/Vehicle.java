package thisisgosutry;

import java.util.Scanner;

public class Vehicle {
		
		public String input;
		
		public Vehicle () {}
		
		public boolean readUserInput() {
		Scanner user_input = new Scanner(System.in);
		
		String vin, make, model, color;
		Scanner thistext = new Scanner(System.in);
		
		System.out.println("");
		System.out.print("VIN: ");
		vin= thistext.nextLine();
		
		System.out.print("Make: ");
		make= thistext.nextLine();	
		
		System.out.print("Model: ");
		model= thistext.nextLine();	
		
		System.out.print("Color: ");
		color= thistext.nextLine();
		
		String nextInput = thistext.next();
		input += nextInput;
		
			return true;	
		}	
				
		public String getInput() {
			return input;		
		}	
}
