package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("rawtypes")
		List data = new ArrayList();//create array list
		
		data.add("kant");//ADDing object ArrayList
		data.add(1, "Simmi");
		data.add("singh");
		data.add("raj");
		data.add("kant");
		data.add(0,null);
		data.add(12);
		
		System.out.println(data);
		@SuppressWarnings("rawtypes")
		Iterator itr=data.iterator();
		//System.out.println(itr );
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		//traversing list through Iterator
		//Iterator itr=list.iterator();
		

	}


}
