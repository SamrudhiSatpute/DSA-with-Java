public class Largestnum {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        int max =Integer.MIN_VALUE;
        for(int i =0 ; i<=arr.length-1; i++){
            if (arr[i] > max){
                max = arr[i];

            }
        }
       System.out.println("the largest number is " + max);

    }
}
