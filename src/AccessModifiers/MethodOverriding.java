package AccessModifiers;
class A{  
protected void msg(){System.out.println("Hello java");}  
}  
public class MethodOverriding extends A {
	// void msg(){System.out.println("Hello java");}//C.T.Error  
	 public static void main(String args[]){  
		 MethodOverriding obj=new MethodOverriding();  
	   obj.msg();  
	   }  
}
  