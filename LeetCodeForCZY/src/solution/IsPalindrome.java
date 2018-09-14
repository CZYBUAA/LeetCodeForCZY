package solution;

public class IsPalindrome {
	public boolean isPalindrome(int x) {
        String xString=Integer.toString(x);
        char[] xChar=new char[xString.length()];
        xString.getChars(0, xString.length(), xChar,0);
        
        int left=0;
        int right=xChar.length-1;
        while(left<=right) {
        	if(xChar[left]!=xChar[right]) {
        		return false;
        	}
        	left++;
        	right--;
        }
        
        return true;
        
    }
}
