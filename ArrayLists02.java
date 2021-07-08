package exercisesSlides;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists02 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a letter If the letter exists in list1 convert it to "$"
		 * otherwise add the element which user entered into the list1
		 */

		ArrayList<Character> charLists = new ArrayList<>();

		charLists.add('S');
		charLists.add('a');
		charLists.add('m');
		charLists.add('e');
		charLists.add('t');
		charLists.add(' ');
		charLists.add('I');
		charLists.add('b');
		charLists.add('e');
		charLists.add('i');
		charLists.add('s');
		charLists.add('s');

		System.out.println("First ArrayList: " + charLists);
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a char: ");
		char c = scan.next().charAt(0);

		if(!(charLists.contains(c))) {
			charLists.add(c);
		} else {
			for(int i = 0; i<charLists.size(); i++) {
				if(charLists.get(i) == c) {
					charLists.set(i, '$');
				}
			}
		}
		
		System.out.println("New ArrayList: " + charLists);

		scan.close();

	}

}
