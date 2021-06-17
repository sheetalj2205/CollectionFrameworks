import java.util.*;
public class arrayList {

	public static void main(String[] args) {
		//created an ArrayList of type Integer
		ArrayList <Integer> num = new ArrayList<>(); 
		
		//adds value to the end of an ArrayList
		num.add(10);
		num.add(9); 
		
		//get() Method returns the element at the specified index in an ArrayList
		System.out.println("element at index 0: "+ num.get(0));
		
		//add(int index,E value) method inserts the value parameter at a specified index in an ArrayList
		num.add(2,7);
		num.add(2,5);
		
		
		/*set(int index,E value) method replaces the element at the specified index 
		 with the parameter value in an ArrayList
		*/
		num.set(0,11);
		
		//remove(int index) removes the element at specified index in an ArrayList
		num.remove(1);
		
		//size() method returns the number of elements in an ArrayList
		System.out.println(num.size());
		System.out.println(num);
		
	}

}
