package Java_opps;

public class Argument_passing {
	int n;
	void get_data(int i){
		n=i;
	}
	void put_data() {
		int rev=0;
		while(n>0) {
			rev=(rev*10)+n%10;
			n=n/10;
		}
		System.out.println("Reverse=" + rev);
	}
}
