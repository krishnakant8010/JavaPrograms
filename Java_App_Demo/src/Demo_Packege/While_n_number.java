package Demo_Packege;

import java.util.Scanner;

public class While_n_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your number upto which you want to print? ");
		n=sc.nextInt();
		
		i=1;
		while(i<=n) {
			System.out.println(i);
			i++;
		}
		sc.close();
	}

}
