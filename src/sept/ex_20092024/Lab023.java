package sept.ex_20092024;

public class Lab023 {

	public static void main(String[] args) {
		   // condition ? expression_if_true : expression_if_false
        int a1 = (30 > 40) ? 10: 20;
        System.out.println(a1);

        
        // condition ? expression_if_true : expression_if_false
        int tushar = 4;
        int prabhu = 7;
        String result = tushar > prabhu ? "Tushar won" : "Prabhu Won";
        System.out.println(result);
        
        
        String str= 10 > 20 ? "10" : "TWENTY";
        System.out.println(str);
        
        
        // Max, Min between two numbers.
        int tushar_salary = 4;
        int prabhu_salary = 7;
        // max
        // min
        int max = tushar_salary > prabhu_salary ? tushar_salary : prabhu_salary;
        System.out.println(max);

        
        int a = 10;
        int b = 20;
        int max1 = a > b ? a : b;
        int min = a < b ? a : b;
        System.out.println(max1);
        System.out.println(min);
        
        
        
        
        
        
        
        
	}

}
