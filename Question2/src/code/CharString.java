package code;

public class CharString {
	public int count_one_char(String a, char b){
		int count=0;
		for (int i=0; i<a.length();i++)
			if (a.charAt(i)==(b)){
				count++;
			}
		System.out.println(count);
		return count;
		
	}

}
