package Demo_Packege;

import java.util.Scanner;

public class Table_of_mumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter number of Table");
		n=sc.nextInt();
		
		while(i<=10) {
			System.out.println(n+"*"+i+"="+i*n);
			i++;
		}
		sc.close();

	}

}
