package task;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		//Leap Year Program - Find 2024?
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a year");
		int year = sc.nextInt();

		if(year%4 ==0)
		{
			System.out.println("this is leap year");
		}
		else {
			System.out.println("no not a leap year");
		}
	}

}
