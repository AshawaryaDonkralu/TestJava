package sept.ex_23092024;

public class Lab035 {

	public static void main(String[] args) {
	// if we are using arrow -> , then we can eliminate break ,available  only above jdk 13
		int itemcode = 007;
		switch (itemcode) {
		case 001 -> System.out.println("its an laptop" );
		case 002 -> System.out.println("its a desktop");
		case 003 , 004 -> System.out.println("its an mobile");
		default ->System.out.println("none");
		
		
		
		
		
		
		}
		
		   System.out.println((10 -4 )+ 3 *4);
	        // BODMAS
	        // bracket of div, mul, add and sub
//	        (10 - 4) -> 6
//	        3 *4 -> 12
//	                6+12 -> 18
		
	}

}
