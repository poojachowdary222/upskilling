package javax.servlet.jsp;

public class PrimitiveToWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=20;  
		Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
		  
		System.out.println(a);  
		System.out.println(i);
		System.out.println(j);
	}

}
