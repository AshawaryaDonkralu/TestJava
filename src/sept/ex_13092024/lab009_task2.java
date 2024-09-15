package sept.ex_13092024;

public class lab009_task2 {

	public static void main(String[] args) {
		/*Prepare a small calculator, which supports +, - , , / and %(?) - Modulus operator
		double a = 34;
		double b = 10;
		Print - a+b, a-b, ab, a/b, a%b all the outputs.*/ 
		//variable data 
		int a = 25;
		int b = 16;
		
		//operators
		int add = a + b ;
		int sub = a - b ;
		int multi = a * b ;
		int div = a / b ;
		int reminder = a % b ; 
		
		//print variable 
		System.out.printf("%d + %d = %d ", a , b , add);
		System.out.println();
		System.out.printf("%d - %d = %d ", a , b , sub);
		System.out.println();
		System.out.printf("%d x %d = %d ", a , b , multi);
		System.out.println();
		System.out.printf("%d / %d = %d ", a , b , div);
		System.out.println();
		System.out.printf("%d modulus  %d = %d ", a , b , reminder);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
