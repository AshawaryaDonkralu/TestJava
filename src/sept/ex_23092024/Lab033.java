package sept.ex_23092024;

public class Lab033 {

	public static void main(String[] args) {
		// its a valid syntax --> no output will come 
   int a = 10;
   switch (a) {
   
   }
  // its an valid  , Char can be used it takes its integer form 
   char ch = 'A';//65
   switch (ch) {}
   
   //Boolean is aninvalid , cannot be used in switch 
   //Boolean b = true;
  // switch (b) {}
   

   //direct long is not supported we need to covert it into int.
   long a1 = 76l;
   switch ((int)a1) {}
   
   // duplicate case not allowed
   int a2 = 98;
   switch (a2) {
   case 98 :
	   System.out.println(98);
  // case 98 :
	  // System.out.println(98);// Duplicate case 
	  
	   
   }
	}

}
