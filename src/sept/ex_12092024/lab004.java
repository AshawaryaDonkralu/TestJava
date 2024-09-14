package sept.ex_12092024;

public class lab004 {

	public static void main(String[] args) {
		//Create a variable called name of type String and assign it the value "John"
		String name = "jhon";
		System.out.println(name);
		
		//Create a variable called myNum of type int and assign it the value 15:
		int myNum = 15;
		System.out.println(myNum);
		
		int myNum1;
			myNum1 = 15;
			System.out.println(myNum1);
			
			float a = 16.88f;
			System.out.println(a);
			
			char letter = 'A';
			System.out.println(letter);
			
			boolean  myBool  = true;
			System.out.println( myBool);

			
			/*String - stores text, such as "Hello". String values are surrounded by double quotes
        int - stores integers (whole numbers), without decimals, such as 123 or -123
        float - stores floating point numbers, with decimals, such as 19.99 or -19.99
        char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
        boolean - stores values with two states: true or false*/
		
	
			
			//Student data 
			String studentName = "Riya";
			int studentId = 26;
			byte studentAge = 11;
			float studentFee = 66.78f;
			char studentGrade = 'B';
			
			//Print variable 
			System.out.println("studentName"  + " = " +   studentName);
			System.out.println("studentAge"  + " = " +  studentAge);
			System.out.println("studentId"  + " = "  +  studentId);
			System.out.println("studentFee"  + " = "  +  studentFee);
			System.out.println("studentGrade"  + " = "  + studentGrade);
			
			//create a program to calculate the area of a rectangle
			 int length = 80;
			 int width = 90;
			 int area ;
			 area = length * width ;
			 System.out.println("Area of rectangle" + " = " + area );
	}

}
