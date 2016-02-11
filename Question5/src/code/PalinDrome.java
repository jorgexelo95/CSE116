package code;

public class PalinDrome {

	public boolean palindrome(String input) {
		String output="";
		for (int i=input.length()-1;i>=0;i--){
			output+=input.charAt(i);
			
		}
		String lower=input.toLowerCase();
		String lower2=output.toLowerCase();
		if(lower.equals(lower2)){
		return true;}
		else return false;
		}
	}

