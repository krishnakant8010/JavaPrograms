package Demo_Packege;

public class PrimeNumber_of1_to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,Count,j;
		for(i=1;i<=20;i++) {
			Count=0;
			for(j=1;j<=i;j++) {
				if(i%j==0) {
					Count++;
				}
				}
				if(Count==2)
					System.out.println(i);
			}
			
		}

	

}
