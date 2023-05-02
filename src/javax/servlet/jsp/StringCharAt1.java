package javax.servlet.jsp;

public class StringCharAt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome to Javatpoint portal";      
	    int strLength = str.length();      
	    // Fetching first character  
	    System.out.println("Character at 0 index is: "+ str.charAt(0));      
	    // The last Character is present at the string length-1 index  
	    System.out.println("Character at last index is: "+ str.charAt(strLength-1));      
		
	}

}
