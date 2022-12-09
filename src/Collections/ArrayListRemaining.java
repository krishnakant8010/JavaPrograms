package Collections;

import java.util.*;
import java.util.ArrayList;

public class ArrayListRemaining {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Greaps");
		list.add("Lichi");
		list.add("Orange");
		System.out.println("Traversing list through List Iterator:");

		// Here, element iterates in reverse order
		ListIterator<String> litr = list.listIterator(list.size());
		while (litr.hasPrevious()) {
			// String str=litr.previous();
			System.out.println(litr.previous());
		}
		System.out.println("Traversing list through for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("Traversing list through forEach() method:");
		// The forEach() method is a new feature, introduced in Java 8.
		list.forEach(a -> { // Here, we are using lambda expression
			System.out.println(a);
		});

		System.out.println("Traversing list through forEachRemaining() method:");
		Iterator<String> itr = list.iterator();
		itr.forEachRemaining(a -> // Here, we are using lambda expression
		{
			System.out.println(a);
		});
	}

}
