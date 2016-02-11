package code;

public class TwoChars {

	public int count_two_chars(String a, char c, char d) {
		int count1=0;
		int count2=0;
		int count3=0;
		for(int i=0;i<a.length();i++)
			if(a.charAt(i)==c){
				count1++;}
		for(int j=0;j<a.length();j++)
			if(a.charAt(j)==d){
			count2++;
		}	
				count3=count1+count2;
		return count3;


	}

}
