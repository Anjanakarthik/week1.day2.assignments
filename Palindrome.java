package week1.day2.assignments.mandatory;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value= "madam";
		String revstring= "";
		char [] valuearray = value.toCharArray();
		
		for(int i =valuearray.length-1;i>=0;i-- ) {
			char revnew = valuearray[i];
			revstring =revstring + value.charAt(i);
		}
		if(revstring.equalsIgnoreCase(value)) {
			System.out.println("it is a palindrome");
		}else
			System.out.println("it is not a palindrome");

	}

}
