package sept.ex_18092024;

public class Lab22 {

	public static void main(String[] args) {
		//int a= 10;
		//System.out.println(a++  + a);
		
	        //  A = a++ -->10 ,
	        // +
	        // B = a 
	        // Line No. |  a |  Exp
	        //  5 | 10 | NA
	        // 6    10

		
	   // int a = 10;
       // System.out.println(a++ + ++a);
       // System.out.println(a);
        // A -> a++ -> 10 , a= 11
        // + -> operator
        // B -> ++a  -> a= 12 exp -> 12

        // Line no | a  |  Exp
        // 5   | 10 | NA
        // 6  | 12 | 10 + 12

	    
		
		// int a = 10;
	       // System.out.println(++a + ++a);
	       // System.out.println(a);
//
	        // A  -> ++a ->  Exp1 -> 11 , a = 11
	        //  +
	        // B- > ++a  ->  a = 12 , Exp2 = 12
	        // 23 , 12
	   
	        
	        
	        int a = 10;
	        System.out.println(++a + a++ + a++);
	        System.out.println(a);
	        //  Part ->  A -> ++a , Exp1 = 11 , a = 11
	        //  Part ->  B -> a++ , Exp2 = 11 , a = 12
	        //  Part ->  C -> a++, Exp3 = 12 , a = 13
	}

}
