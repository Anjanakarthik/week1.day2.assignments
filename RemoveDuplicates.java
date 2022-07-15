package week1.day2.assignments.mandatory;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "we learn java basics as part of java sessions in java week1";
		String [] words = text.split(" ");
		for(int i=0;i<words.length;i++) {
			for (int j =i+1;j<words.length;j++) {
				if (words[i].equals(words[j])) {
					words[j]=" ";
					
				}
			}
		}
for(int i=0;i<words.length;i++) {
	System.out.print(words[i]+ " ");
}
	}

}
