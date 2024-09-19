package sept.ex_16092024;

public class lab012 {

	public static void main(String[] args) {
		 // Unary Operator
        int a = +65; // + ->  unary operator
        int b = -1;  // - -> unary operator
        System.out.println(a);
        System.out.println(b);
        b = b+1;
        System.out.println(b);
        
        
        String first_name = "Pramod";
        String last_name = "Dutta";
        int a1 = 10;
        int b1 = 10;
        System.out.println(first_name + last_name + a1 + b1);
        System.out.println(first_name + last_name + (a1 + b1));
        System.out.println(a1 + b1 + first_name + last_name);
        
        
        
    //  Compound Assignment Operators
        int a2 = 10;
        // += ,-= , *=, /=
//        a2 += 20; // a2 = a2+ 20
//        a2 -= 20; // a2 = a2 - 20
//        a2 /= 10; // a2 = a2/10
        a*=10; // a2 = a2*10

        System.out.println(a2);


     // Relational Operators  = boolean
        //  > < , >= <= , != , ! -> true or false
        int a3 = 10;
        int b3 = 30;
        boolean c = a3 > b3;
        System.out.println(c);

        int age_mamitha = 34;
        int age_pramod = 34;
//        boolean result = age_pramod > age_mamitha; // false
        boolean result = age_pramod >=age_mamitha; // false // age_pramod > age_mamitha or age_pramod =age_mamitha;;
        System.out.println(result);     
        
        
        
        
        
        
        
        
        
        
	}

}
