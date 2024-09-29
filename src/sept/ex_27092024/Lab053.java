package sept.ex_27092024;

public class Lab053 {

	public static void main(String[] args) {
        //  While -> int -> condition -> body -> increment / decrement
        // Do while  -> // int -> body -> condition -> incre / drement

		int i = 0;
		do{
			System.out.println(i);
			
			i++;
		}
		while(i < 10);
		
		int a = 0;
		do {
			System.out.println(a);// one time execution will be done
			a++;
		}
		while (a<0);
		
		// diffence between while and do-while
		
		int b = 0;
		while(b<0) {
			System.out.println(b);
			b++;
		}
		
	}

}
