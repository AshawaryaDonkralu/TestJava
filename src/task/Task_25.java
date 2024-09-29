package task;

import java.util.Scanner;

public class Task_25 {

	public static void main(String[] args) {
		// Table of number n = 10, print table with For or while. 

		//int num = 10;
		/*for(int i=1 ; i<=10 ; i++) {
			System.out.println(num*i);*/
		//}
		/*
		 * int num = 10; int i = 1; while(i<=10) { System.out.println(num*i); ++i; }
		 */
	
		
	        Scanner sc = new Scanner(System.in); // New Object
	        System.out.println("Enter a number: ");
	        int num = sc.nextInt();
	        
	        System.out.printf("Multiplication Table of %d: ",num);
	        System.out.println();
	        for (int i = 1 ; i <= 10; i++){
	            System.out.println(num + " X " + i + " = " + (num*i));
	        }
	
	
	
	}
	
	
	

}
