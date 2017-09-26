package session7_Assignment3;

public class StringSpace {

	public static void main(String[] args) {
		
        StringBuffer sb=new StringBuffer();  //creating  buffer 
		
		System.out.println("The default capacity of buffer : " + sb.capacity());      //printing default capacity of buffer 
		
		//if we append the string with less characters than capacity ,it remains same
		
		sb.append("Welcome");//appending this String

		System.out.println("The capacity of buffer after appending string smaller than buffer capacity  : " +sb.capacity()); //printing capacity
		sb.append("Show me the count now after adding a bigger line exceeding capacity");       //appending this string 
		
		System.out.println("The capacity of buffer after appending string bigger than buffer capacity  : " +sb.capacity());  //printing capacity after appending string  
	
	}
}
	


