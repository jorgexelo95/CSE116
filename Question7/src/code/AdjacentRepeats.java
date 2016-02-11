package code;
public class AdjacentRepeats { 
	public int hasAdjacentRepeats(String output) {
		for(int i=0;i<output.length()-1;i++){
			if(output.charAt(i)==output.charAt(i+1)){
				System.out.println(i);
				return i;
			}	
		}
		
		return -1;}}

	
