package Demo_Packege;

import java.util.Scanner;

public class Binary_Search {

	public static void main(String args[]) {
	int a[]=new int[10];
	int i,j=0,key,flag = 0,mid,pos = 0; 
	
	Scanner sc=new Scanner(System.in);
	for(i=0;i<10;i++) {
		System.out.print("Enter Number=");
		a[i]=sc.nextInt();
	}
	System.out.println("Enter Find key Number=");
	key=sc.nextInt();
	
	for(i=0;i<=j&&flag==0;j++) {
		mid=(i+j)/2;
		if(a[mid]==key) {
			flag=1;
			pos=mid+1;
		}
		if(a[mid]>key) {
			j=mid-1;
		}
		if(a[mid]<key) {
			i=mid+1;
		}
	}
	if(flag==1) {
		System.out.println("Enter Find at" +pos);
	}
	else {
		System.out.println("Number not Find ");
	}
	
}
}