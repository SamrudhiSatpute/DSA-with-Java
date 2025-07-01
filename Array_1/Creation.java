import java .util.*;
class Creation {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
       // int numbers[] = {1, 2, 3, 4, 5};
        String fruits[] = {"Apple ", "banana","cherry"};
        
        // when input we need
        int marks[] = new int[5];
        Scanner sc = new Scanner (System.in);
        // for (int  num : marks){
        //     System.out.println("entert the marks");
        //     num = sc.nextInt();
        // }

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();    
        System.out.println(marks[0]);
    }
}