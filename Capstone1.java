import java.util.List;
import java.util.Scanner;

public class Capstone1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);


		// VARIABLES
		
		String input;
		String output;
		String vowelInput = input + "way";
		String consonantInput = input + "ay";
		char vowels;
	

		// prompt the user for a word
	
		do { System.out.println("We're going to play PIG LATIN! Please enter a word: ");
		input = scan.nextLine();
		
		//put to lower case
		input = input.toLowerCase();
		
		
		
		//find where vowels are
		// if starts with vowel add -way to end
		//else if word is consonant, move all the first consonants to the end of word and add -ay to the end of the word
		
			if (input.startsWith("a")) {
			System.out.println(vowelInput);
			}
		else if (input.startsWith("e")) {
			System.out.println(vowelInput);
		}
		else if (input.startsWith("i")) {
			System.out.println(vowelInput);
		}
		else if (input.startsWith("o")) {
			System.out.println(vowelInput);
		}
		else if (input.startsWith("u")) {
			System.out.println(vowelInput);
		}
		else {System.out.println(consonantInput);
		
		}
		//print word
		System.out.println(input);
		
		}

	System.out.println("Do youo want to play again? (y/n)");input=scan.nextLine();

	/*
	 * userWordTranslation = userWord + "ay";
	 * System.out.println(userWordTranslation);
	 * 
	 * if (userWordTranslation.charAt(0).isVowel()) {
	 * 
	 * }
	 */
	}
}
