package javax.servlet.jsp;

import java.util.Arrays;
import java.util.List;

public class ListOfIntegersStartswith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(12,3,4,10,20,155,6,7,8,9);
numbers.stream()
.map(s -> s + "")
.filter(s -> s.startsWith("1"))
.forEach(System.out::println);
	}

}
