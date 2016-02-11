package code;

public class ReplacingCharacters {


	public String replaceCharacters(String input, String targets, char c) {
		String changed = "";
		for(int i=0; i<input.length();i++){
			for(int j=0; j<targets.length();j++){
			if(input.charAt(i)==targets.charAt(j)){
			changed = changed+c;
			break;}
			if(j==(targets.length()-1)){
				changed = changed+input.charAt(i);
			}
			}
			
			
}
		System.out.println(changed);
		return changed;}
}