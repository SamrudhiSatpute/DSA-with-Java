package Recursion;

public class factorial {

    public static int fact (int n){
       // base case
       if (n==0 ){
        return 1;
       }
         // recursive case
         int ans=(n * fact(n-1) );
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
       int f= fact(n);
       System.out.println(f);
    }
}
