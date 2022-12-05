package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetListDemo {
	

public static void main(String a[]) {
	// TODO Auto-generated method stub
	Set l1=new HashSet();
	l1.add(12);
	l1.add(8);
	l1.add(2);
	l1.add(null);
	l1.add(23);
	l1.add("kant");
	l1.add(12);
	l1.add(null);
	Iterator itr=l1.iterator();
	
	while(itr.hasNext()) {
	
	System.out.println(itr.next());
	
	}	
}
}
