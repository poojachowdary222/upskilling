package javax.servlet.jsp;

public class ReverseStringUsingStringBuffer {

	 public static void main(String[] args) {
		 
	        String name = "java";
	        StringBuffer sb = new StringBuffer(name);
	        System.out.println("Reverse of java is: " + sb.reverse());
	 
	    }
	}


