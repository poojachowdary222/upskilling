package day3;

public class AccessModifiers {

    public int publicVariable = 10;
    private int privateVariable = 20;
    protected int protectedVariable = 30;

    public void displayVariables() {
        System.out.println("Public Variable: " + publicVariable);
        System.out.println("Private Variable: " + privateVariable);
        System.out.println("Protected Variable: " + protectedVariable);
    }

    
}

