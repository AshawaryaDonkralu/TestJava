package task;

import java.util.Scanner;

public class TriangleClassifier {

	public static void main(String[] args) {
		// Write a program that classifies a triangle based on its side lengths.

		// Given three input values representing the lengths of the sides, determine

		// if the triangle is equilateral (all sides are equal),

		// isosceles (exactly two sides are equal), or

		// scalene (no sides are equal).

		// Use an if-else statement to classify the triangle.

		// side1, side2, side3 ->
		
		
		Scanner sc = new Scanner(System.in);// Create a Scanner object
		System.out.println("Enter the length of side1 :");
		double side1 = sc.nextDouble();
          
		System.out.println("Enter the length of side2 :");
		double side2 = sc.nextDouble();
		
		System.out.println("Enter the length of side3 :");
		double side3 = sc.nextDouble();
		
		if (side1>=1 && side2>=1 && side3>=1) 
		{
			
		if(side1==side2 && side1==side3 && side2==side3) {
			System.out.println("equilateral Triangle");
		}
		else if (side1 == side2 || side1 == side3 || side2 == side3) {
			System.out.println("Isosceles Triangle ");
		}
		
		else {
			System.out.println("scalene Triangle");
		}
		}
		
		else {
			System.out.println("Ahwarya,are you mad!!  ");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
