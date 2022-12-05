package Demo_Packege;

import java.util.Scanner;

public class Find_Positive_negative_zero_mumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		num=sc.nextInt();
		
		if(num>0) {
			System.out.println("This number is positive: " +num);
		}
		else if(num<0) {
			System.out.println("Thsu number is Negative: " +num);
		}else {
			System.out.println("This number is zero: " +num);
		}
		sc.close();
	}

}
