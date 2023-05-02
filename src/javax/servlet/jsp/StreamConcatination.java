package javax.servlet.jsp;

import java.util.stream.Stream;

public class StreamConcatination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stream<Integer> Stream1 = Stream.of(1,2);
		Stream<Integer> Stream2 = Stream.of(3,4);
		
		Stream.concat(Stream1, Stream2)
		.forEach(words -> System.out.println(words));

	}

}
