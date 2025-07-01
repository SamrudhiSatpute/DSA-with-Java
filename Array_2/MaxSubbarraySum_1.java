package Array_2;

public class MaxSubbarraySum_1 {
    public static int maxsubarray(int arr[]){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i =0 ;  i< arr.length ; i++) {
            for (int j = i; j < arr.length; j++) {
                  sum = 0; 
                for (int k =i; k<=j ; k++){
                    sum += arr[k];
                   if (sum > max){
                    max = sum;
                   }
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        int ans = maxsubarray(arr);
        System.out.println("the maximum subarray sum is " + ans);
    }
}
