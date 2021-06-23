package collectionsFramework;
import java.util.*;


public class MapInterface {

	public static void main(String[] args) {
		// Map implementation using HashMap
		Map<Integer, String> names = new HashMap<>();
		
		//put(K, V) - Inserts the association of a key K and a value V into the map.If the key is already present, the new value replaces the old value.
        names.put(1,"Sheetal");
        names.put(2,"Aryan");
        names.put(3,"Arjun");
        names.put(4,"Sejal");
        
        
        //putIfAbsent(K, V) - Inserts the association if the key K is not already associated with the value V.
        names.putIfAbsent(4,"Sheetal");
        
        //get(K) - Returns the value associated with the specified key K.
        System.out.println(names.get(4));
        
        //containsKey(K) or containsValue(v) - Checks if the specified key K or value V is present in the map or not.
	    System.out.println(names.containsKey(2));
	
	    //replace(K, V) - Replace the value of the key K with the new specified value V.
	    names.replace(2,"Archit");
	    
	    //remove(K) - Removes the entry from the map represented by the key K.
	    names.remove(1);
	    
	    //remove(K, V) - Removes the entry from the map that has key K associated with value V.
	    names.remove(2,"Aryan");
	    
	    //keySet() - Returns a set of all the keys present in a map.
	    System.out.println(names.keySet());
	    
	    //values() - Returns a set of all the values present in a map.
	    System.out.println(names.values());
	    
	    //entrySet() - Returns a set of all the key/value mapping present in a map.
	    System.out.println(names.entrySet());
	    
	    //iteration of Map
	    for(Map.Entry<Integer, String> e :names.entrySet()) {
	    	System.out.println(e);
	    	System.out.println(e.getKey());
	    	System.out.println(e.getValue());
	    	
	    }
	    
	    //iteration of keys only
	    for(Integer key: names.keySet()) {
	    	System.out.println(key);
	    }
        
	}

}
