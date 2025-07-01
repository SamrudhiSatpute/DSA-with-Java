package Recursion;

public class FindtheIndex {

    public static int findIndex(int arr[] , int target , int i){
        if(arr[i] == target){
            return i;
        }
        if(i == arr.length){
            return -1; // target not found
        }
        return findIndex(arr, target, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {3,5,8,4,3,9,5};
       int ans = findIndex(arr, 4, 0);
       System.out.println(ans);
    }
}
