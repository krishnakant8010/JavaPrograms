package Collections;
import java.util.*;
import java.util.HashSet;

public class HashSetExample {
	public static void main(String args[]){  
		  //Creating HashSet and adding elements  
		    HashSet<String> set=new HashSet<String>();  
		           set.add("One");    
		           set.add("Two");    
		           set.add("Three");   
		           set.add("Four");  
		           set.add("Five"); 
		           
		           Iterator<String> i=set.iterator();  
		           while(i.hasNext())  
		           {  
		           System.out.println(i.next());  
		           } 
		           //HashSet example ignoring duplicate elements
		         //Creating HashSet and adding elements  
		           HashSet<String> set1=new HashSet<String>();  
		           set1.add("Ravi");  
		           set1.add("Vijay");  
		           set1.add("Ravi");  
		           set1.add("Ajay");  
		           //Traversing elements  
		           Iterator<String> itr=set1.iterator();  
		           while(itr.hasNext()){  
		            System.out.println(itr.next());  
		           }  
		 }  
}
