// 3 for loops to print all subarrays of an array
public class Subarrayas {

    public static void subarrays(int arr[]) {
       int count = 0;
        for (int i =0 ;  i< arr.length ; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k =i; k<=j ; k++){
                    System.out.print(arr[k] + " ");
                    count++;
                }
                System.out.println();
            }
        }
        System.out.println("total" + count + " subarrays");
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}; 
        subarrays(arr);
    }
}
