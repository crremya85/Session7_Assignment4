package session_Assignment2;
import java.util.*;
public class SortingStrings {

	public static void main(String[] args) {
		

		Scanner scanner= new Scanner(System.in);					// Creating object for scanner 
		
		System.out.println("Enter the message with a space between each words and symbols");	// Print message to input
		String message = scanner.nextLine();						// Assign to input to local string variable
		
		String[] stringArray = message.split(" ");	// Split the words across space and assign it to Array
		Arrays.sort(stringArray); // Sort the Array 
				
		System.out.println("Sorted message is ");	 // Printing message
		
		for(String str:stringArray) {	// For each element in Array
			
			char[] chars= str.toCharArray();	// Split each word into Char and store in Character Array
			Arrays.sort(chars);			// Sort the character array
			
			for(char chr:chars) {		// For each element in Char Array
				System.out.print(chr);			// Print the Sorted Char
			}
			
			System.out.print(" "); 		// Print Space to separate each word after printing from sorted character Array
		}
		
		scanner.close();		// Close scanner object

	}

}
