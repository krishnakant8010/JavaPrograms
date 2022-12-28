package Java_opps;

public class ConstructorOverloading {

	 int id;  
	    String name;  
	    int age;  
	    //creating two arg constructor  
	    ConstructorOverloading(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //creating three arg constructor  
	    ConstructorOverloading(int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
	    } 
	    
	    void display(){System.out.println(id+" "+name+" "+age);}
}
