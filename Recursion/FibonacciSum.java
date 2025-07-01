package Recursion;
// O(n^2) solution
public class FibonacciSum {

    public static int fib(int n){
        // base case 
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        // recursive case
        int f1 = fib(n-1);
        int f2 = fib(n-2);
        int ans = f1 + f2;
        return ans;
    }
    public static void main(String[] args) {
        int n= 8;
        System.out.println("Fibonacci of " + n + " is: " + fib(n));
    }
}
