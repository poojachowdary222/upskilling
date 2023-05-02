package javax.servlet.jsp;
import java.util.*;
public class DP {
	
	    public static void main(String args[]) {
	            List<String> myList = Arrays.asList("a","b","c","b");
	            Set<String> set = new HashSet();
	            myList.stream()
	                  .filter(n -> !set.add(n))
	                  .forEach(System.out::println);
	    
      }
 }