package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListIterator {
	public static void main(String args[]) {
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("yello");
		al.add("Green");
		al.add("Black");
		al.add("White");
		
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("---------------------------");
		for(String list:al) {
			System.out.println(list);
		}
		
		//accessing the element    
		  System.out.println("Returning element: "+al.get(1));//it will return the 2nd element, because index starts from 0  
		  //changing the element  
		  al.set(1,"Dates");  
		  //Traversing list  
		  for(String fruit:al)    
		    System.out.println(fruit);    
		  
		System.out.println("Sorting Number");
		
		ArrayList<Integer> intal=new ArrayList<Integer>();
		intal.add(23);
		intal.add(45);
		intal.add(2);
		intal.add(30);
		
		Collections.sort(intal);
		
		for(Integer sortlist:intal) {
			System.out.println(sortlist);
		}
		
		
	}

}
