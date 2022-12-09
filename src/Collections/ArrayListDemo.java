package Collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> data = new ArrayList<String>();// create array list
		// oolean isEmpty()
		System.out.println(data.isEmpty());
		System.out.println(data);

		// void add(int index, E element)
		data.add("kant");
		data.add("Pahul");
		data.add("Pashant");
		data.add("Krishna");

		System.out.println(data);

		System.out.println("void add(int index, E element");
		data.add(1, "raj");
		System.out.println(data);

		System.out.println("//boolean addAll(Collection<? extends E> c)");
		ArrayList<String> data1 = new ArrayList<String>();
		data1.add(" Mohan");
		data1.add("Ck");
		data1.add("Rohit");

		data.addAll(data1);
		System.out.println(data1);

		System.out.println("//boolean addAll(int index, Collection<? extends E> c)");
		data.addAll(1, data1);
		System.out.println(data);
		// -----------
		System.out.println("//E get(int index)");
		System.out.println(data.get(2));

		//boolean isEmpty()
		System.out.println("boolean isEmpty()");
		System.out.println(data.isEmpty());
		
		// int lastIndexOf(Object o)
		System.out.println("int lastIndexOf(Object o)");
		System.out.println(data);
		System.out.println(data.lastIndexOf("Mohan"));

		// Object clone()
		System.out.println("// Object clone()");
		data.clone();
		System.out.println(data);

		// boolean contains(Object o)
		System.out.println("boolean contains(Object o)");
		System.out.println(data.contains("kant"));
		System.out.println(data.contains("kant1"));

		// int indexOf(Object o)
		System.out.println("int indexOf(Object o)");
		System.out.println(data);
		System.out.println(data.indexOf("Mohan"));

		// void retainAll(Collection<?> c)
		System.out.println("void retainAll(Collection<?> c)");
		System.out.println(data);
		System.out.println(data1);
		System.out.println(data.retainAll(data1));
		System.out.println(data);
		
		//void trimToSize()
				System.out.println("void trimToSize()");
				System.out.println(data);
				data.trimToSize();
				System.out.println(data);
		

		// E remove(int index) boolean remove(Object o) boolean removeAll(Collection<?>
		System.out.println("--E remove(int index) boolean remove(Object o) boolean removeAll(Collection<?>");
		System.out.println(data.remove(1));
		System.out.println(data);
		System.out.println(data.removeAll(data));

		// void clear()
		System.out.println("// void clear()");
		data1.clear();
		System.out.println(data1);

	}

}
