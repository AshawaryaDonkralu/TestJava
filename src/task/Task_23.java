package task;

import java.util.Scanner;

public class Task_23 {

	public static void main(String[] args) {
		/*
		 * Create a simple calculator that performs addition, subtraction,
		 * multiplication, and division, modus based on user input using switch
		 * statements.
		 * 
		 * Inputs : num 1, num 2, + Output : num1+num2 → print information.
		 */
		Scanner sc = new Scanner(System.in);//creat an object 
		System.out.println("enter the first number");
		int num1 = sc.nextInt();
		
		
		System.out.println("enetr the second number ");
		int num2 = sc.nextInt();
	
		System.out.println("enter the operation (+,-,*,/,%)");
		String operation = sc.next();
		
		
		 //performing operation
		switch (operation) {
		case "+":
			
		System.out.println(num1 + num2);
		 break;
		 
		
			case "-":
			System.out.println(num1 - num2);	
			break;
			
			case "*" :
				System.out.println(num1 * num2);
			break;
			
			case "/" :
			System.out.println(num1 / num2);
			break;
			
			case "%" :
				System.out.println(num1 % num2);
	
		}
		
	}
	}

