package thisisgosutry;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Person {
		public String input;
		
		public Person () {}
		
		public boolean readUserInput() {		
		String fname, lname;
		Scanner thitixt = new Scanner(System.in);
		
		System.out.print("First Name: ");
		fname= thitixt.nextLine();
		
		System.out.print("Last Name: ");
		lname= thitixt.nextLine();	
		
		String nextInput = thitixt.next();
		input += nextInput;
		
			return true;	
		}	
		
		
		public String getInput() {
			return input;
		}
}
