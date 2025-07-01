package Array_2;

public class KadanesAlgo {

    public static void maxsubbaray(int arr[]) {
        int max = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum < 0) {
                currentSum = 0; // reset current sum if it goes negative
            }
            max = Math.max(currentSum, max); // update max if current sum is greater
        }
        System.out.println("Maximum Subarray Sum: " + max);
    }

    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxsubbaray(arr); // method call added here
    }
}
