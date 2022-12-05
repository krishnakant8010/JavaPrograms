package Demo_Packege;

import java.util.Scanner;

public class Sum_n_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,Add;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number upto which you wnat to  print?");
		n=sc.nextInt();
		Add=0;
		i=1;
		while(i<=n) {
			System.out.print(i+ "+");
			Add=Add+i;
			i=i+1;
		}
		
		System.out.println( "\n" + "Adition:" +Add);
		sc.close();
	}
	
}
