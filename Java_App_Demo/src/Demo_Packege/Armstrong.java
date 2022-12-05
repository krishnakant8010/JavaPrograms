package Demo_Packege;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,z,count=0,digit,prod,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter number=");
		n=sc.nextInt();
		z=n;
		while(z>0) {
			count=count+1;
			z=z/10;
		}
		//System.out.println("No of digit=" +count);
		z=n;
		while(z>0) {
			digit=z%10;
			prod=1;
		
		for(i=1;i<=count;i++) 
			prod=prod*digit;
		sum=sum+prod;
		z=z/10;
		
	}
		if (sum==n)
			System.out.println("Armstrong=" +sum);
		else
			System.out.println("Not Armstrong Number");
	
	
	}
}
