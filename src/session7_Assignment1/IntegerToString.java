package session7_Assignment1;

public class IntegerToString {

	public static void main(String[] args) {
		
		System.out.println("Integer to String Conversion using inbuilt String function");
		System.out.println("----------------------------------------------------------");
		
		// conversion of integer to String using String.valueOf(int)
		
		int num1 = 1234; // Declaration and initialization of Integer Variable1
		String str1 = String.valueOf(num1);   //Converting value of integer to String and assigning the value 
		System.out.println("Value of String1: " +str1); // into a String variable
		
		// conversion of integer to String using StringBuffer
		
		int num2 = 5678;  // Declaration and initialization of Integer Variable2
		StringBuffer sb = new StringBuffer(); // used to concatenate multiple values into a string
		sb.append(num2);
		String str2 = sb.toString();
		System.out.println("Value of String2: " +str2);
	}

}
