package Collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapComparing {
public static void main(String ages[]) {
	Map<Integer, String> map=new HashMap<Integer, String>();
	map.put(1, "Apple");
	map.put(2, "Mango");
	map.put(3, "Litchi");
	map.put(4, "Orange");
	
	System.out.println("-------------comparingByKey()--------------------------");
	  //Returns a Set view of the mappings contained in this map        
    map.entrySet()  
    //Returns a sequential Stream with this collection as its source  
    .stream()  
    //Sorted according to the provided Comparator  
    .sorted(Map.Entry.comparingByKey())  
    //Performs an action for each element of this stream  
    .forEach(System.out::println);
    
    System.out.println("--------------comparingByKey() in Descending Order-------------------");
    //Returns a Set view of the mappings contained in this map    
    map.entrySet()  
    //Returns a sequential Stream with this collection as its source  
    .stream()  
    //Sorted according to the provided Comparator  
    .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))  
    //Performs an action for each element of this stream  
    .forEach(System.out::println);
 
    System.out.println("----------------comparingByValue()-----------------");
  //Returns a Set view of the mappings contained in this map    
    map.entrySet()  
    //Returns a sequential Stream with this collection as its source  
    .stream()  
    //Sorted according to the provided Comparator  
    .sorted(Map.Entry.comparingByValue())  
    //Performs an action for each element of this stream  
    .forEach(System.out::println);
    
    System.out.println("------------------comparingByValue() in Descending Order------------------");
  //Returns a Set view of the mappings contained in this map    
    map.entrySet()  
    //Returns a sequential Stream with this collection as its source  
    .stream()  
    //Sorted according to the provided Comparator  
    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))  
    //Performs an action for each element of this stream  
    .forEach(System.out::println); 
}
	
}
