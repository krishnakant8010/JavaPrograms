package Java_opps;

public class String_methord_test extends String_example{

int len;
char postion;
void get_len() {
	len=name.length();
	System.out.println("Lenght of given first name=" +len);
}
void get_postion() {
	postion=name.charAt(0);
	System.out.println("Char position  of given first name=" +postion);

}

}
