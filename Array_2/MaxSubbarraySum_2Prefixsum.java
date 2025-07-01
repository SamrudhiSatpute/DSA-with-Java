package Array_2;

public class MaxSubbarraySum_2Prefixsum {
    public static void maxsubarray(int arr[]){
          int max = Integer.MIN_VALUE;
          int sum = 0;
          int prefix[] = new int[arr.length];
        prefix[0] = arr[0]; // first is always same

        for (int i =1 ;  i< prefix.length ; i++) {
            prefix[i] = prefix[i-1] +arr[i];
        }
         for (int i =0 ;  i< arr.length ; i++) {
            for (int j = i; j < arr.length; j++) {
                  
                sum = i == 0?  prefix[j] : prefix[j] - prefix[i-1];
                
                   if (sum > max){
                    max = sum;
                   }
                }
            }
            System.out.println(max);
        }
            
    

    public static void main(String[] args) {
         int arr[] = {1,-2,6,-1,3};
        maxsubarray(arr);
       // System.out.println("the maximum subarray sum is " + ans);

    }
}
