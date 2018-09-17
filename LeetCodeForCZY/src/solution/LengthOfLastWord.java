package solution;

public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
        int result=0;
        
        String[] string=s.split(" ");
        
        if(string.length==0) {
        	return result;
        }
        if("".equals(string[string.length-1]))
        	return result;
        else {
        	result=string[string.length-1].length();
        	return result;
        }    
    }
}
