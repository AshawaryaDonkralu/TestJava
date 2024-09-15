package sept.ex_13092024;

public class lab009_task2 {

	public static void main(String[] args) {
		/*Prepare a small calculator, which supports +, - , , / and %(?) - Modulus operator
		double a = 34;
		double b = 10;
		Print - a+b, a-b, ab, a/b, a%b all the outputs.*/ 
		//variable data 
		double a = 34;
		double b = 10;
		
		//operators
		double  add = a + b ;
		double sub = a - b ;
		double multi = a * b ;
		double div = a / b ;
		double reminder = a % b ; 
		
		//print variable 
		System.out.printf("%f + %f = %f ", a , b , add);
		System.out.println();
		System.out.printf("%f - %f = %f ", a , b , sub);
		System.out.println();
		System.out.printf("%f x %f = %f ", a , b , multi);
		System.out.println();
		System.out.printf("%f / %f = %f ", a , b , div);
		System.out.println();
		System.out.printf("%f mod %f = %f ", a , b , reminder);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
