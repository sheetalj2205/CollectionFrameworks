
package collectionsFramework;
import java.util.*;

public class ListInterface {

	public static void main(String[] args) {
		        //create an ArrayList of type Integer
				List <Integer> list = new ArrayList<>(); 
				
				//adds value to the end of an ArrayList
				list.add(10);
				list.add(5);
				list.add(20);
				
				//get() Method returns the element at the specified index in an ArrayList
				System.out.println("element at index 0: "+ list.get(0));
				
				//add(int index,E value) method inserts the value parameter at a specified index in an ArrayList
				list.add(2,7);
				
				//set(int index,E value) method replaces the element at the specified index with the parameter value in an ArrayList
				list.set(0,11);
				
				//remove(int index) removes the element at specified index in an ArrayList
				list.remove(1);
				
				//size() method returns the size of elements in an ArrayList
				System.out.println(list.size());
				
				//contains(object) method returns boolean value checks item is there or not OR it calls equals method
				System.out.println(list.contains(2.0));
						
				//check if collection is empty or not
				System.out.println(list.isEmpty());
				
				//traversing the collection using simple for loop
				for(int i=0;i<list.size();i++) {
					System.out.println("Element is : "+list.get(i));
				}
				
				
				//traversing the collection using for-each loop
				for(Integer element : list) {
					System.out.println("Element is : " +element);
				}
				
				//traversing the collection using Iterator interface methods
				Iterator<Integer> it= list.iterator();
				while(it.hasNext()) {
					System.out.println("Element is : "+ it.next());
				}
				
				//to remove all the elements from list
				list.clear();
				
				

	}

}
