package javax.servlet.jsp;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//import java.util.stream;

public class DupilicateElements {

	public static void main(String[] args) {
		List<String> list2=Arrays.asList("Devraj","Poojaree","Akash","Devraj");
        
 Set<String> set = new HashSet();
         list2.stream()
               .filter(n -> !set.add(n))
               .forEach(System.out::println);

        
	}

}
