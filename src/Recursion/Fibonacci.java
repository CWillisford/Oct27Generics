package Recursion;

public class Fibonacci {
    public static int fibonacci(int n){
        if(n<=1){
            System.out.println("BASE CASE");
            return n;
        }
        else{
            System.out.println("Entering fibonacci("+ n +")");
            int result = fibonacci(n-1) + fibonacci(n-2);
            System.out.println("Returning fibonnaci(" + n +")");
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
        System.out.println(fibonacci(5));
        System.out.println(paren(5));
    }
}
