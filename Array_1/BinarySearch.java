public class BinarySearch {
// for sorted array always
    public static int search(int arr[], int key){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (end -start)/2;
            if (arr[mid] ==key ){
                return mid;
            }
            else if (arr[mid]< key ){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
           
        }
         return -1;
    }
    public static void main(String[] args) {
      int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}; 
      int key = 5;
      int ans = search(arr, key);
      System.out.println("Element found at index: " + ans); 
    }
}
