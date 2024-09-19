package task;

public class Task_16 {

	public static void main(String[] args) {
	//Difference between = and  ==?
//The difference between = and == is that
//= is used to assign a value to a variable, while == is used to compare two values for equivalence.

		//byte b = 10; long l = 10l; → How much Byte will be used. 	
		/*byte b = 10 uses 1 byte

                   long l = 10L uses 8 bytes

                   total memory 8+1 = 9 bytes*/
		
		//Another byte b = 10; byte c = 10;  What is the answer4 if the perform b+c, What is the data type it will give in result. 
		
		byte b = 10;
		byte c = 10;
		System.out.println(b+c);
		//Byte + Byte = int, so if Byte b = 10 and Byte c = 10 then the answer 20 is stored in int.
		
		
		short s = 10;

        char c1 = 'A'; //65

        int ss = s+c1;

        System.out.println(ss);
		
		
		
		
	}

}
