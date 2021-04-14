package main;

public class Main {

    public static void main(String[] args) {
	    int factorial = 0;
        System.out.println("Factorial of " + factorial + " equals to " + calculateFactorial(factorial));
    }

    public static int calculateFactorial(int number){
        if(number == 0) return 1;
        else return number*calculateFactorial(number-1);
    }
}
