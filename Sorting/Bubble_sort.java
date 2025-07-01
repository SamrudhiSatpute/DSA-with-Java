package Sorting;

public class Bubble_sort {
//hello

    public static void sort(int arr[]){
       // int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++ ){
                if(arr[i]> arr[j]){
                    int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                 }//else{
                //     continue;
                // }
            }
        }
        for (int i=0;  i< arr.length ;i++){
        System.out.print(arr[i] + " ");

        }
    }
    public static void main(String[] args) {
        int arr[] = { 5,4,1,3,2};
        sort(arr);
    }
}
