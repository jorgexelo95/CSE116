package code;

public class ReplacingVowels {

	public String replaceVowels(String input) {
		String changed = "";
		for(int i=0; i<input.length();i++){
			if(input.charAt(i)=='o'){
			changed = changed+'*'; 	
			}
			else changed = changed+input.charAt(i);
}
		System.out.println(changed);
		return changed;}}
