package javax.servlet.jsp;

public class WrapperToPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a=20;
		
		 int i=a.intValue();
		int j=a;
		
		System.out.println(a);  
		System.out.println(i);
		System.out.println(j);
	}

}
