package Demo_Packege;

import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		int i,key = 0,flag=0,pos = 0;
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<10;i++) {
		System.out.print("Enter Number=");
		a[i]=sc.nextInt();
		
		}
		System.out.println("Enter Find key Number=");
		key=sc.nextInt();
		for(i=0;i<10&&flag==0;i++) {
			if(a[i]==key) {
				flag=1;
				pos=i+1;
			}
		}
		if(flag==1) {
			System.out.println("Number Find at=" +pos);
		}
		else {
			System.out.println("Number not Found");
		}
	}

}
