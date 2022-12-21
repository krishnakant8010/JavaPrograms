package Java_opps;

public class Static_member_function {
	int roll;
	String name;
	static String c_name="indyfin";
	
	Static_member_function(int x, String y){
		roll=x;
		name=y;
	}
	void Display() {
		System.out.println("Roll=" +roll + "\n" + "Name=" +name + "\n" + "College=" +c_name);
	}
	static void change() {
	 c_name="H R College";
	}
}
