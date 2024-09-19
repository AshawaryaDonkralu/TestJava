package sept.ex_16092024;

public class lab014 {

	public static void main(String[] args) {
		  // || - OR

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //  And  && // only true && true returns true
        // T || T -> T
        // T || F -> F
        // F || T -> F
        // F || F -> F

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        
        
        
        // BIO
        int a = 12;
        boolean b = !(a > 10 || a < 5);
        // !(true); -> false
        //  BODMAS
        // // Bracket, Of, Division,
        //        // Multiplication, Addition, and Subtraction.
        System.out.println(b);

	}

}
