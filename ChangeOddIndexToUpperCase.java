package week1.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String test ="changeme";
char[] chararray=test.toCharArray();
for(int i =0;i<chararray.length;i++) {
	char ch =test.charAt(i);
	if(i%2==0) {
		System.out.print(Character.toLowerCase(ch));
		
	}else
		
System.out.print(Character.toUpperCase(ch));

	}

}
}
