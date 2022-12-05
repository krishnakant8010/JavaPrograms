package Demo_Packege;

import java.util.Scanner;

public class Powerxy {
	
	public static void main(String a[]) {
		int x,y,prod=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter base number=");
		x=sc.nextInt();
		System.out.println("Eneter power number");
		y=sc.nextInt();
		
		while(y>0) {
			prod=prod*x;
			y--;
		}
		System.out.println("Poper=" +prod);
		sc.close();
		
	} 

}
