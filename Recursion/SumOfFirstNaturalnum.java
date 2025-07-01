package Recursion;

public class SumOfFirstNaturalnum {
    public static int sum(int n){
        // base case
        if (n == 0) {
            return 0;
        }
        // recursive case
    int ans = n+sum(n-1);
    return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        int sum = sum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}
