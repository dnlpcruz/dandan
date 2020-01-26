package thisismain;

import java.io.IOException;
import java.util.Scanner;
import thisisgosutry.Person;
import thisisgosutry.Address;
import thisisgosutry.Vehicle;

public class themainclass {
	public static void main(String[]args) throws IOException {
			
		int a;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Name");
		Person pers = new Person();
		if (pers.readUserInput()) {
			String userInput = pers.getInput();
		}		
		
		System.out.print("Address Details");
		Address adris = new Address();
		if (adris.readUserInput()) {
			String userInput = adris.getInput();
		}
		
		System.out.print("input number of vehicle: ");

		
		while (true) {		
			a = input.nextInt();
			if (a != 0)
			{
				System.out.print("Vehicle Details");
			Vehicle veh = new Vehicle();
			if (veh.readUserInput()) {
				String userInput = veh.getInput();				
			}	
			}
			else {
				break;
			}
		}
		
		

	}	
}
