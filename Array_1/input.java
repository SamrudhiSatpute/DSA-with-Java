import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner mf = new Scanner (System.in);
        System.out.println("Enter two integers to sum them up:");
        int a = mf.nextInt();
        int b = mf.nextInt();

        System.out.println("The sum of " + a + " and " + b + " is: " + (a + b));
    }
}
