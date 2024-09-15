package sept.ex_14092024;

public class lab010_Exercise {

	public static void main(String[] args) {
	//1. Write a Java program to print 'Hello' on screen and your name on a separate line.
		
		System.out.println("Hello" + '\n' + "Ashwarya");
		
/*Write a Java program to print the results of the following operations.
		Test Data:
			a. -5 + 8 * 6
			b. (55+9) % 9
			c. 20 + -3*5 / 8
			d. 5 + 15 / 3 * 2 - 8 % 3*/
		
		System.out.println(-5 + 8 * 6);
		System.out.println((55 + 9 ) % 9 );
		System.out.println(20 + -3*5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		
		/*Write a Java program that takes two numbers as input and displays the product of two numbers.
		Test Data:
			Input first number: 25
			Input second number: 5*/
		//variable input
		int a1 = 25;
		int b1 = 5 ;
		//operator
		int multi = a1*b1;
		//output
		System.out.printf("%d X %d = %d" , a1, b1 , multi );
		System.out.println();
	
		/*Write a Java program to display the following pattern.
Sample Pattern :

   J    a   v     v  a                                                  
   J   a a   v   v  a a                                                 
J  J  aaaaa   V V  aaaaa                                                
 JJ  a     a   V  a     a*/
	
		System.out.println("    j   a  v      v   a");
		System.out.println("    j  a a  v    v   a a");
	System.out.println("j   j aaaaa   V V   aaaaa ");
	System.out.println (" jj  a     a   V   a     a");	
		
	/*Write a Java program to print the area and perimeter of a circle.
	Test Data:
		Radius = 7.5*/	
		
		float r = 7.5f;
		final float pie = 3.14f;
		double area = pie *  r * r ;
		double peri = 2* pie * r;
		System.out.println("Area of circle:" + area);
		System.out.println("Perimeter of circle: " + peri );
		
		
		/* Write a Java program to add two binary numbers.
		 Input Data:
		 Input first binary number: 10
		 Input second binary number: 11*/
		
		//int first_binary = 0b1010;
		//int second_binary = 0b1011;
		
		//System.out.println(first_binary + second_binary );
		
		//Write a Java program to check whether Java is installed on your
		System.out.println("\nJava Version: " + System.getProperty("java.version"));
	}

}
