package Recursion;

public class checksortedArrsy {

    public static boolean isSorted(int arr[] , int i)
{
    // base case
    if(arr.length -1 == i){
        return true;
    }

    if(arr[i] >  arr[i+1]){
        
        return false;
    }
    return isSorted(arr, i+1);
  


}    public static void main(String[] args) {
        int[] arr = {1,2,3,6,4,5};
        System.out.println(isSorted(arr, 0));
    }
}
