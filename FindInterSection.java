package week1.day2.assignments.mandatory;

public class FindInterSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arrayone = {3,2,11,4,6,7};
		int [] arraytwo = {1,2,8,4,9,7};
		 for(int i=0;i<arrayone.length;i++) {
			 for(int j=0;j<arraytwo.length;j++) {
				 if(arrayone[i]==arraytwo[j]) {
					 System.out.print(arrayone[i]);
				 }
			 }
		 }

	}

}
