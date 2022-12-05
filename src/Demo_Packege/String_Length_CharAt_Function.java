package Demo_Packege;

import java.util.Scanner;

public class String_Length_CharAt_Function {
	public static void main(String args[]) {
		int lenght,char_position,i;
		String name=new String();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name=");
		name=sc.nextLine();
		//lenght=name.length();
		char_position=name.charAt(5);
		
		System.out.println("Name=" +name + ", Lenght=" +  name.length());
		
		for(i=0;i<name.length();i++) {
			System.out.println("Nmae of letter Position=" + name.charAt(i));
		}
		
		
	}
	
}
