package Demo_Packege;

import java.util.Scanner;

public class Count_Total_Vowel_Consonant_String {
	public static void main(String args[]) {
		int i,len,vowel=0,cons=0;
		
		String words=new String();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Word=");
		words=sc.nextLine();
		words=words.toUpperCase();
		len=words.length();
		for(i=0;i<len;i++) {
			char c=words.charAt(i);
			if(c !=' ') {
				
			}
			
			if(c== 'A' || c=='E' || c=='I' || c=='O' || c=='U') {
			vowel=vowel+1;
			}
			else {
				cons=cons+1;
			}
		}
		System.out.println("Vowel=" +vowel + ", Consonant=" +cons);
	}
	
}
