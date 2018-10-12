import java.util.Scanner;

public class Capstone1 {

	public static void main(String[] args) {

		

		// VARIABLES
		
		String input = "";
		String runAgain = "";
		
		
	
		System.out.println("We're going to play PIG LATIN!" );
		
		// prompt the user for a word
	do {	
		System.out.println("Please Enter a word");
		
		Scanner scan = new Scanner(System.in);
		
		input = scan.nextLine();
		
		//put to lower case
		input = input.toLowerCase();
		
	
					
	
		// if word starts with vowel add -way to end
		
	try { 
		if (input.startsWith("a") || input.startsWith("e") || input.startsWith("i") || input.startsWith("o") || input.startsWith("u")) {
			System.out.println(input + "way");
			}
			
			
		//else if word starts with consonants, move all the first consonants to the end of word and add -ay to the end of the word
			
			else if ((!input.startsWith("a") || !input.startsWith("e") || !input.startsWith("i") || !input.startsWith("o") || !input.startsWith("u")) &&
					 (input.substring(1,2).equals("a") || input.substring(1,2).equals("e") || input.substring(1,2).equals("i") ||
					  input.substring(1,2).equals("o") || input.substring(1,2).equals("u")) ) {
				System.out.println( input.substring(1) + input.charAt(0) + "ay");
			}
			
			else if ((!input.substring(1,2).equals("a") || !input.substring(1,2).equals("e") || !input.substring(1,2).equals("i") ||
					  !input.substring(1,2).equals("o") || !input.substring(1,2).equals("u")) && 
					  (input.substring(2,3).equals("a") || input.substring(2,3).equals("e") || input.substring(2,3).equals("i") ||
					   input.substring(2,3).equals("o") || input.substring(2,3).equals("u")) ) {
			System.out.println( input.substring(2) + input.charAt(0) + input.charAt(1) + "ay");	
			}
			
			else if ((!input.substring(2,3).equals("a") || !input.substring(2,3).equals("e") || !input.substring(2,3).equals("i") ||
					  !input.substring(2,3).equals("o") || !input.substring(2,3).equals("u") ) && 
					  (input.substring(3,4).equals("a") || input.substring(3,4).equals("e") || input.substring(3,4).equals("i") ||
					   input.substring(3,4).equals("o") || input.substring(3,4).equals("u")) ) {
			System.out.println( input.substring(3) + input.charAt(0) + input.charAt(1) + input.charAt(2) + "ay");	
			}
			
			else if ((!input.substring(3,4).equals("a") || !input.substring(3,4).equals("e") || !input.substring(3,4).equals("i") ||
					  !input.substring(3,4).equals("o") || !input.substring(3,4).equals("u")) &&  
					  (input.substring(4,5).equals("a") || input.substring(4,5).equals("e") || input.substring(4,5).equals("i") ||
					   input.substring(4,5).equals("o") || input.substring(4,5).equals("u")) ) {
			System.out.println( input.substring(4) + input.charAt(0) + input.charAt(1) + input.charAt(2) + input.charAt(3) + "ay");	
			}
			
			else if ((!input.substring(4,5).equals("a") || !input.substring(4,5).equals("e") || !input.substring(4,5).equals("i") ||
					  !input.substring(4,5).equals("o") || !input.substring(4,5).equals("u")) &&  
					  (input.substring(5,6).equals("a") || input.substring(5,6).equals("e") || input.substring(5,6).equals("i") ||
					   input.substring(5,6).equals("o") || input.substring(5,6).equals("u")) ) {
			System.out.println( input.substring(5) + input.charAt(0) + input.charAt(1) + input.charAt(2) + input.charAt(3) + input.charAt(4) + "ay");	
			}
			
			else if ((!input.substring(5,6).equals("a") || !input.substring(5,6).equals("e") || !input.substring(5,6).equals("i") ||
					  !input.substring(5,6).equals("o") || !input.substring(5,6).equals("u")) &&  
					  (input.substring(6,7).equals("a") || input.substring(6,7).equals("e") || input.substring(6,7).equals("i") ||
					   input.substring(6,7).equals("o") || input.substring(6,7).equals("u")) ) {
			System.out.println( input.substring(5) + input.charAt(0) + input.charAt(1) + input.charAt(2) + input.charAt(3) + input.charAt(4) + input.charAt(5) + "ay");	
			}
		
			
			else { 
				System.out.println("Please Enter a Valid Word");
			}
			
	}
	
	catch (Exception e) {
		System.out.println("Please Enter a Valid Word");
	}
		

	System.out.println("Do you want to play again?");
	
	runAgain=scan.nextLine(); 
	
	runAgain=runAgain.toLowerCase();

	
	} while (runAgain.contains("y"));

	
	System.out.println("Thank you for playing!");
	
	
	} }

