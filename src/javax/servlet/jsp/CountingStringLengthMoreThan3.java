package javax.servlet.jsp;

import java.util.Arrays;
import java.util.List;

public class CountingStringLengthMoreThan3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("abc", "bcd", "sanju","defg", "jk");

		 long number = list.stream() 
				 .filter(x -> x.length()> 3)
				 .count();
		 System.out.println("string length more than 3 is " + number);  

	}
}
