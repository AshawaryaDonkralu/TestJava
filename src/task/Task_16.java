package task;

public class Task_16 {

	public static void main(String[] args) {
	//Difference between = and  ==?
//The difference between = and == is that
//= is used to assign a value to a variable, while == is used to compare two values for equivalence.
		   //   = and  ==
        int a1 = 10 ; // Assign the value to the variable.
        boolean b1 = (10 == 11); // Comparsion 2 values
        System.out.println(a1);
        System.out.println(b1);
        // === in JS

		//byte b = 10; long l = 10l; → How much Byte will be used. 	
		/*byte b = 10 uses 1 byte and 8 bits

                   long l = 10L uses 8 bytes and 64 bits 

                   total memory 8+1 = 9 bytes*/
		
		//Another byte b = 10; byte c = 10;  What is the answer4 if the perform b+c, What is the data type it will give in result. 
		
		byte b = 10;
		byte c = 10;
		System.out.println(b+c);
		//Byte + Byte = int, so if Byte b = 10 and Byte c = 10 then the answer 20 is stored in int.
		
		
		short s = 10;

        char c1 = 'A'; //65  ASCII value

        int ss = s+c1;

        System.out.println(ss);
		
//      byte a = 10;
//      byte b = 10;
//      int c = a + b;
//      System.out.println(c);

      char a2 = 'A'; // 65
      System.out.println(a1);
      char b2 = 'B'; //66
      int c2 = a2 + b2;
      System.out.println(c2); // 131

      
      
      System.out.println('A' == 65); // ASCII
      System.out.println('B' == 66); // ASCII
		
		
	}

}
