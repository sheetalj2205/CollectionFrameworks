package collectionsFramework;
import java.util.*;

public class arrayDeque {

	public static void main(String[] args) {
		//Creating Integer type ArrayDeque
		ArrayDeque<Integer> num = new ArrayDeque<>();

		//offer() - inserts the specified element at the end of the array deque
		num.offer(11);
		num.offer(14);
		num.offer(15);
		
		//offerFirst() - inserts the specified element at the beginning of the array deque
	    num.offerFirst(12);
	    
		//offerLast() - inserts the specified element at the end of the array deque
        num.offerLast(13);
        
        //peek() - returns the first element of the array deque
        System.out.println("First Number is : " + num.peek());
        
        //peekFirst() - returns the first element of the array deque (equivalent to peek())
        System.out.println("First Number is : " + num.peekFirst());
        
        //peekLast() - returns the last element of the array deque
        System.out.println("Last Number is : " + num.peekLast());
        
        //poll() - returns and removes the first element of the array deque
        System.out.println("First Number is : " + num.poll());
        
        //pollFirst() - returns and removes the first element of the array deque (equivalent to poll())
        System.out.println("First Number is : " + num.pollFirst());
        
        //pollLast() - returns and removes the last element of the array deque
        System.out.println("Last Number is : " + num.pollLast());
        
        //iterator() - returns an iterator that can be used to iterate over the array deque
        Iterator<Integer> iterate = num.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        
        //descendingIterator() - returns an iterator that can be used to iterate over the array deque in reverse order

	}

}
