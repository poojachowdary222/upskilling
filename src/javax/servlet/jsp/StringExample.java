package javax.servlet.jsp;


public class StringExample {

	public static void main(String[] args) {
		
        //........creating sting 3 ways.......
		
		//creating a string by java string literal 
		String str = "ModernIndia "; 
		char arrch[]={'G','r','e','a','t','L','e','a','r','n','i','n','g'}; 
		//converting the char array arrch[] to string str2 
		String str2 = new String(arrch); 
		//creating another java string ‘str3’ by using new keyword 
		String str3 = new String("String Example"); 
		//Displaying all the three strings 
		System.out.println(str); 
		System.out.println(str2); 
		System.out.println(str3); 
		
	}

}
