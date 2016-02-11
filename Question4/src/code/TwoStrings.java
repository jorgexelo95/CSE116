package code;

public class TwoStrings {

	public int count_chars_in_String(String s, String characters) {
		int count=0;
		
		for(int i = 0; i < s.length(); i++)
		{
			for(int j = 0; j < characters.length(); j++)
			{
				if(s.charAt(i)==characters.charAt(j))
				{
					count++;
				}
			}
		}
		System.out.println(count);
		return count;
	}





}
