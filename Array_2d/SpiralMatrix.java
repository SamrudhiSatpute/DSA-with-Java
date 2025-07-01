package Array_2d;

public class SpiralMatrix {

    public static void printSpiral(int arr[][]){
        int startrow = 0;
        int endrow = arr.length-1;
        int startcol = 0;
        int endcol = arr[0].length-1;
while (startrow <= endrow && startcol <= endcol) {
        for(int i= startcol ; i<= endcol;i++){
            System.out.println(arr[startrow][i] + " ");
        }
        for(int j = startrow+1 ; j<=endcol ; j++){
            System.out.println(arr[j][endcol] +" ");
        }
       
        for(int i=endcol-1; i>=startrow ; i--){
            if (startcol ==  endcol ){
                return;
            }
            System.out.println(arr[endrow][i] +" ");
        }
       
        for(int j= endrow-1 ; j>= startrow+1 ;j--){
            System.out.println(arr[j][startcol]+" ");
        }
        startrow++;
        endrow--;
        endcol--;
        startcol++;
    }

    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};

        printSpiral(arr);
        }
    }

