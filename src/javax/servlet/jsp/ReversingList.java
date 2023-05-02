package javax.servlet.jsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReversingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println("Before reversing a list :" + l);
		Collections.reverse(l);
		System.out.println("After reversing a list :" + l);

	}

}
