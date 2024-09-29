package sept.ex_27092024;

import java.util.Scanner;

public class Lab055 {

	public static void main(String[] args) {
	//	The Scanner class is used to get user input, and it is found in the java.util package.
 //To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation.
	// nextLine() method, which is used to read Strings:

		
		Scanner myObj = new Scanner (System .in);   // // Create a Scanner object
		System.out.println("Enter username");
		
		String username = myObj.nextLine(); // // Read user input
		System.out.println("Username is: " + username); //// Output user input
		
		
	}

}
