package sept.ex_20092024;

public class Lab026 {
	/*Use if to specify a block of code to be executed, if a specified condition is true
	Use else to specify a block of code to be executed, if the same condition is false
	Use else if to specify a new condition to test, if the first condition is false*/

	public static void main(String[] args) {
		  int num = 11;
	        if ( num % 2== 0) {
	            System.out.println("Even");
	        } else {
	            System.out.println("Odd");
	        }

	        // Modulus - %
	        // 10%2 -> 0
	        // 11%2 -> 1
//	        2 | 11 | 5 - Q
//	            10
//	           -----
//	            1 - R

	        
	        
	        int num1 = 30;
	        int num2 = 20;
	        if(num1>num2) {
	        	System.out.println(num1);
	        }
	        else {System.out.println(num2);
	        }
	
	int x = 30;
	int y = 30;
	if (x>y)
	{
		System.out.println(x);
	}
	else if (x<y) { 
		System.out.println(y);
		}
	else {
		System.out.println("equal");
	}
	
	
	
	
	}

}
