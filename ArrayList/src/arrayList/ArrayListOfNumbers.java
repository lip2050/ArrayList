package arrayList;

import java.util.ArrayList;

public class ArrayListOfNumbers {
	
	public static void main (String []args) {
		
	 ArrayList <Integer> numbers = new ArrayList<Integer>();
	 
	 numbers.add(234);
	 numbers.add(45);
	 numbers.add(654);
	 numbers.add(77);
	 numbers.add(977);
	 
	 System.out.println("These are the five numbers as requested : " + numbers.get(0) + ", " + numbers.get(1) + ", " + numbers.get(2) + ", " + numbers.get(3) + ", " +numbers.get(4));
	 
	}

}
