package Java_opps;

public class CopyConstructor {
	 int id;  
	    String name;  
	    //constructor to initialize integer and string  
	    CopyConstructor(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //constructor to initialize another object  
	    CopyConstructor(CopyConstructor s){  
	    id = s.id;  
	    name =s.name;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
}
