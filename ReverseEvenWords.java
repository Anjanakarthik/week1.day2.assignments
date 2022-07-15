package week1.day2.assignments.mandatory;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "i am a software tester";
		String output =" ";
		String[] words =test.split(" ");
		
		for (int i=0;i<words.length;i++) {
			if(i%2!=0) {
				char [] charArray = words[i].toCharArray();
				String revword= "";
				for(int j = charArray.length-1;j>=0;j--) {
					revword = revword + charArray[j];
				}
				output = output+revword+"";
			}else
				output = output+words[i]+"";
			
		}
		System.out.println(output);

	}

}
