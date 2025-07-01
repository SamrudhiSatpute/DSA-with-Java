public class Rhombus {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
    
        //part 1
        for(int i= 1; i<=5; i++){
            for (int j =1 ; j<=n-i;j++){
                System.out.print(" ");
            }

         //part 2
            for (int j = 1; j<=n ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    
    }
}
//     * * * * * 
//    * * * * *
//   * * * * *
//  * * * * *
// * * * * *