package Demo_Packege;

public class Continue {

	public static void main(String a[]) {
		int i=0;
		while(i<=10) {
			i++;
			
			if(i==5)
				continue;
			System.out.println(i);
		}
		System.out.println("Excution done");
	}
}
