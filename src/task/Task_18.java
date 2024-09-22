package task;

public class Task_18 {

	public static void main(String[] args) {
		//Give some another example of Widening with Implicit and Explicit, Narrowing with implicit and explicit. 	
		//widening -->Implicit Type Casting.
	    int num = 10;
	    System.out.println("The integer value: " + num);

	    // convert into double type
	    double data = num; //  
	    System.out.println("The double value: " + data);
	    //Java first converts the int type data into the double type. And then assign it to the double variable.
	    //Widening Type Casting, the lower data type (having smaller size) is converted into the higher data type (having larger size). Hence there is no loss in data.
	   // Type casting - Coverting one data type into anothere. Two types

	  //  1) Widening 

	   // byte a = 1;

	   // int b ;

	   // b = a; // Implicit widening

	  //  b = (int) a; //Explicit widening

	   // 2)Narrowing

	  //  int a = 100;

	   // byte b;

	  //  b = a; //narrowing Implicity Error

	   // b = (byte) a;//narrowing Implicity leads to data loss
	
	    int a = 10; 
	    System.out.println(  --a + a --  + a--);
	    System.out.println(a);
	
	    int a1 = 10; 
	    System.out.println(  --a1 + a1++ + a1--); 
	    System.out.println(a1);
	
	    int a2 = 10; 
	    System.out.println(  a2-- + a2 --  + a2 --); 
	    System.out.println(a2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
