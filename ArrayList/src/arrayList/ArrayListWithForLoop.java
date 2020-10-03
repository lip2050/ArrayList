package arrayList;

import java.util.ArrayList;

public class ArrayListWithForLoop {
	
	public static void main (String []args) {
		
		 ArrayList <Integer> numbers = new ArrayList<Integer>();
		 
		 numbers.add(23);
		 numbers.add(45);
		 numbers.add(66);
		 numbers.add(90);
		 numbers.add(109);
		
		for(int i=0;i<numbers.size();i++)
		{
			System.out.println("Index "+ i +" : " + numbers.get(i));
		}
	}

}
