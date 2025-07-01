// Pattern 2 use row and columns concept for better understanding
public class HollowRectangle {
    public static void hollow_rectangle() {

        for(int i=1; i<=5; i++){
            for (int j=1 ; j<=4; j++){
                if(i==1 || i==5 || j==1 || j==4){
                    System.out.print("*");// no space in between
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       hollow_rectangle();
    }
}
