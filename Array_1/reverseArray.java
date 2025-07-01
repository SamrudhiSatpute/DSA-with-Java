
//when we take fuunction with int return type, we use int[] and ans[] to store the result 
public class reverseArray {

    public static int[] reverse(int arr[] ){
        int start = 0 , end = arr.length - 1;

        while (start< end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
  public static void main(String[] args) {
     int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}; 
     int ans[] = reverse(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
  }  
}
}
