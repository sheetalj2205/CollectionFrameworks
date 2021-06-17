import java.util.*;
public class linkedList {

	public static void main(String[] args) {
		//create a LinkedList of non-type without generics i.e non-type safe
		LinkedList list= new LinkedList();
		
		//add() method adds an element at the end of a linkedList
		list.add(10);
		list.add("Sheetal");
		list.add(2.0); 
		list.add("Hiii");//added all types of variables
		
		//add(int index, E value) method adds value at an specified index
		list.add(1,"Hello"); 
		
		//remove(int index) method removes element from specified index
		list.remove(2);
		
		//remove(object) method removes object
		list.remove("Hello");
		
		//contains(object) method returns boolean value checks item is there or not OR it calls equals method
		System.out.println(list.contains(2.0));
		
		//check if collection is empty or not
		System.out.println(list.isEmpty());
		
		//set(int index, E value) method replaces element with a value at an specified index
		list.set(0, 1.0);
		
		//get(int index) method returns an element at a specified index
		System.out.println(list.get(0));
		
		System.out.println(list);//toString() method
		
		
		//create a vector of type double and add all elments from linkedList to vector
		Vector <String> vec = new Vector<>();
		vec.addAll(list);
		System.out.println(vec);

	}

}
