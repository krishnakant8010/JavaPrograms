package Demo_Packege;

import java.util.Scanner;

public class Sum_of_given_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter anu number:");
		n=sc.nextInt();
		while(n>0){
			sum=sum+n%10;
			n=n/10;
		}
		System.out.println("Sum= " +sum);
		sc.close();
	}

}
