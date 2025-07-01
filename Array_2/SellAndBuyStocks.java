package Array_2;

public class SellAndBuyStocks {

    public static int maxProfit(int arr[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < arr.length; i++) {
            // Case 1: Update buy price if current price is lower
            if (arr[i] < buyprice) {
                buyprice = arr[i];
            } else {
                // Case 2: Calculate profit if selling today gives better result
                int profit = arr[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            }
        }

        return maxprofit;
    }

    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr)); // Output: 5
    }
}
