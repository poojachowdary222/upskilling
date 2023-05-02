package javax.servlet.jsp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfIntegersUsingStreamFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> numbers = Arrays.asList(2,3,4,10,20,155,6,7,8,9);
	
	numbers.stream()
	.filter(n -> n%2 == 0 +1) //to get odd numbers
	
	//.filter(n -> n%2 == 0) //to get even numbers
	
//	.sorted() //to get a list of numbers in ascending order
	
	//.sorted(Collections.reverseOrder()) //to get a list of numbers in descending order
	
	.forEach(System.out::println);
	
	//System.out.println("List:" +numbers); // to print a list of numbers
	
	
	}


 }




