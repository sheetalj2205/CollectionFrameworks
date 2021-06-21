package collectionsFramework;

import java.util.*;

public class QueueInterface {

	public static void main(String[] args) {
		// Creating Queue using the LinkedList class
          Queue<Integer> numbers = new LinkedList<>();
          
        // Inserts the specified element into the queue or you can use add() method
          numbers.offer(10);
          numbers.offer(20);
          numbers.offer(30);
          numbers.offer(40);
          
        // Returns the head of the queue and throws an exception if the queue is empty
          System.out.println(numbers.element());
          
        // Returns the head of the queue. Returns null if the queue is empty.
          System.out.println(numbers.peek());
          
        // Returns and removes the head of the queue. Throws an exception if the queue is empty.
          System.out.println(numbers.remove());
          
        // Returns and removes the head of the queue. Returns null if the queue is empty.
          System.out.println(numbers.poll());
	}

}
