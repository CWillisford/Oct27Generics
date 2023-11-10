package Recursion;

public class Sum {

    public static int sum(int n){
        //base case
        if(n<=0){
            return 0;
        }
        else{
            return n + sum(n-1);
        }
    }

    public static void main(String[] args) {

    }
}
