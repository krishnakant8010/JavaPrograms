package Collections;
import java.util.*;
import java.util.Iterator;


public class LinkedListDemo {
	
	public static void main(String args[]){  
		  
		  LinkedList<String> al=new LinkedList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		  //boolean add(E e)
		  System.out.println("boolean add(E e)");
		  al.add("Vikah");
		  
		  System.out.println(al);
		  
		  //void add(int index, E element)
		  System.out.println("//void add(int index, E element)");
		  al.add(3, "Krishna");
		  System.out.println(al);
		  
		  //void addFirst(E e)
		 al.addFirst("Rakesh");
		 System.out.println(al);
		 
		 //void addFirst(E e)
		 al.addLast("Kant");
		 System.out.println(al);
		 
		 //E element()
		 System.out.println("//E element()");
		 System.out.println( al.element());
		  
		 //E getFirst()
		 System.out.println("//E getFirst()");
		 System.out.println(al.getFirst());
		 
		 //E getLast()
		 System.out.println("//E getLast()");
		 System.out.println(al.getLast());
		 
		 //boolean offer(E e)
		 al.offer("kk");
		 System.out.println(al);
		 
		 //boolean offerFirst(E e)
		 al.offer("Mobile");
		 al.offerLast(" ");
		 System.out.println(al);
		 
		 //E peek()
		 System.out.println(al.peek());
		 
		 //E peekFirst()
		 al.clear();
		 System.out.println(al.peekFirst());
		 System.out.println(al.peekLast());
		 
		 System.out.println(al.pollFirst());
		 
		 
		 al.pop();
		 
		 }  
}
