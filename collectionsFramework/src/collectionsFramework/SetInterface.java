package collectionsFramework;
import java.util.*;

public class SetInterface {

	public static void main(String[] args) {
		    // Creating a set using the HashSet class
        Set<Integer> set1 = new HashSet<>();
        
        //Add elements to the set1
        set1.add(2);
        set1.add(3);
        set1.add(5);
        System.out.println("Set1 is: " + set1);
        
        // removes the specified element from the set
        set1.remove(2);
        
        // Creating another set using the HashSet class
        Set<Integer> set2 = new HashSet<>();
         
        // Add elements
        set2.add(1);
        set2.add(3);
        set2.add(4);
        System.out.println("Set2 is: " + set2);
        
        // Union of two sets
        set2.addAll(set1);
        System.out.println("Union is: " + set2);
        
        //intersection of two sets
        set2.retainAll(set1);
        System.out.println("Intersection is: " + set1);
        
        // Access Elements using iterator()
        System.out.print("Accessing elements using iterator(): ");
        Iterator<Integer> iterate = set1.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        
        // remove set1 from set2 
        set2.removeAll(set1);
        System.out.println(set1);
        

	}

}
