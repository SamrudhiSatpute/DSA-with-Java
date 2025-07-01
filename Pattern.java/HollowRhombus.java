public class HollowRhombus {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n){
        
        //part 1 blank space
        for(int i= 1; i<=5; i++){
            for (int j =1 ; j<=n-i;j++){
                System.out.print(" ");
            }

            for (int j = 1; j<=n ; j++){
               if(i==1 ||i==5 ||j==1 ||j==5){
                System.out.print("*");
               }
               else
               System.out.print(" ");
               
                
            }System.out.println();
        
            }    
    }
}
