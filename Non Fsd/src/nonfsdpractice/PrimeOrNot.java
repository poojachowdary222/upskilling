package nonfsdpractice;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  boolean primeFlag = true;
		  int n = 29;

	        for (int i = 2; i < n; i++){
	            if(n%i==0) {
	                primeFlag = false;
	                break;
	            }
	        }

	        if (primeFlag)
	            System.out.println(n  + " is a Prime number");
	        else
	            System.out.println(n + " is Not a prime number");	
		
	}

}

