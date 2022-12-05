package Demo_Packege;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class try_catch {
	private static Object tempList;

	public static void  main(String[] args) {
		
		ArrayList<String> firstList= new ArrayList<String>(Arrays.asList("Goodk", "Morningkk"));  
		//second arraylist  
		ArrayList<String> secondList= new ArrayList<String>(Arrays.asList("Good", "Morning")); 
		
		List<String> common_elems = new ArrayList<String>(firstList);
		List<String> elems_not_in_list_2 = new ArrayList<String>(firstList);
		
		//System.out.println(secondList);  
		common_elems.retainAll(secondList);
		  
		if(common_elems.size()>0) {
		System.out.println("Common elements in both list: ");  
		System.out.println(common_elems);
		}
		
		elems_not_in_list_2.removeAll(secondList);  
		if(elems_not_in_list_2.size()>0) {
		System.out.println("elements present in list 1 but not in list 2: ");  
		System.out.println(elems_not_in_list_2);
		}
		//storing the comparison output in thirdList  
		//ArrayList<String> thirdList= new ArrayList<String>();  
		//iterator using for-each loop  
//		for(String tempList : firstList)    //tempList is  a variable  
//		thirdList.add(secondList.contains(tempList) ? "Yes" : "No"); 
//		
//		int mactch=firstList.indexOf(secondList);
//		
//	System.out.println(mactch);		
	
	
		 
	}
		
}