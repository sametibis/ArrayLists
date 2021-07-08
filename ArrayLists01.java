package exercisesSlides;

import java.util.ArrayList;

public class ArrayLists01 {

	public static void main(String[] args) {
		/*
		 * Please create an Integer ArrayList add the numbers : 3, 45, 12, 3, 6, 45,
		 * 7, 8 print your list remove the repeated elements from your list please print
		 * the unique list
		 */

		ArrayList<Integer> myArrayList = new ArrayList<>();

		myArrayList.add(3);
		myArrayList.add(45);
		myArrayList.add(12);
		myArrayList.add(3);
		myArrayList.add(3);
		myArrayList.add(6);
		myArrayList.add(45);
		myArrayList.add(3);
		myArrayList.add(45);
		myArrayList.add(7);
		myArrayList.add(8);
		myArrayList.add(8);
		myArrayList.add(8);
		myArrayList.add(3);
		myArrayList.add(45);
		
		System.out.println("First array: " + myArrayList);
		
		ArrayList<Integer> uniqueArrayList = new ArrayList<>();
		
		for (int i = 0; i < myArrayList.size(); i++) {
			if(!(uniqueArrayList.contains(myArrayList.get(i)))) {
				uniqueArrayList.add(myArrayList.get(i));
			}
		}
		
		System.out.println("Unique array list: "+ uniqueArrayList);

	}

}
