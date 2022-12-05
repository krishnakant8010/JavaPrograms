package Demo_Packege;

import java.util.Scanner;

public class Count_Total_Number_of_Words_on_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,len,count=1;
		String words= new String();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any sentence=");
		words=sc.nextLine();
		len=words.length();
		
		for(i=0;i<len;i++) {
			char c,d;
			c=words.charAt(i);
			d=words.charAt(i+1);
			if(c==' ' && d != ' ') {
				count++;
			}
			
		}
		System.out.println("total Words =" +count);

	}

}
