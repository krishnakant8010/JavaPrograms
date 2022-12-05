package Demo_Packege;

import java.util.Scanner;

public class Primid_printing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enet number of row");
		n=sc.nextInt();
		
		for(;0<=n;n--) {
			for(j=1;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
			sc.close();
		}

	}

}
