package Recursion;

public class Fibonacci {
    public static int fibonacci(int n){
        if(n<=1){
            //System.out.println("BASE CASE");
            System.out.println("returning value: " + n);
            return n;
        }
        else{
            //System.out.println("Entering fibonacci("+ n +")");
            int result = fibonacci(n-1) + fibonacci(n-2);
            //System.out.println("Returning fibonnaci(" + n +")");
            System.out.println("returning value: " + result);
            return result;
        }
    }

    public static String paren(int n){
        if(n<=1){
            return "*";
        }
        else{
            return "(" + paren(n-1) + ")";
        }
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci: " + fibonacci(5));
        System.out.println(paren(5));
    }
}
