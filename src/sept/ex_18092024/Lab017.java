package sept.ex_18092024;

public class Lab017 {

	public static void main(String[] args) {
		 long phone = 98273648899l;
		 short phone1 = (short)phone;
		 System.out.println(phone1);//narowwing explicit ==loss
	
		 
		int course = 100;
		float gst = 18.45f;
		//float total_fee = course + gst ; // widening 
		//System.out.println(total_fee);
//      int total_price = course+GST; // Narrowing - Implicit - JVM - Invalid//jvm never allow
		
		int total_fee = course + (int)gst;// Narrowing - Explicit - LOSS
		System.out.println(total_fee);
	}

}
