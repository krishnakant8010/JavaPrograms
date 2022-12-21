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
}
