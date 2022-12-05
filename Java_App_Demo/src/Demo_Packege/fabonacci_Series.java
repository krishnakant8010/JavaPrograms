package Demo_Packege;

import java.util.Scanner;

public class fabonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j=1,k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter max number=");
		n=sc.nextInt();
		while(k<=n) {
			System.out.println(k);
			i=j;
			j=k;
			k=i+j;
		}
		sc.close();
	}

}
