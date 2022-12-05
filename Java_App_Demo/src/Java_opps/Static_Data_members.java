package Java_opps;

public class Static_Data_members {
	int roll;
	String name;
	static String c_name="Indyfin";
	
	Static_Data_members(int x, String y){
		roll=x;
		name=y;
	}
	void display() {
		System.out.println(" Roll=" + roll  +" Name=" + name + " College Name=" + c_name);
	}
	
	public static void   main(String a[]) {
		Static_Data_members  aa= new Static_Data_members(101,"Krishna kant");
		Static_Data_members  aa1= new Static_Data_members(102,"Ajit Kumar");
		aa.display();
		aa1.display();
	}
}
