public class linearSearch {  //O(n) time complexity, O(1) space complexity
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 13;

        int ans =linearsearch(key, arr);
        if (ans == -1)
        {System.out.println("not found");}
        else
        System.out.println("the index "+ans);
        
    }

    public static int linearsearch(int key, int arr[]){
 for(int i =0 ; i<= arr.length-1 ; i++){
            if (arr[i] == key){
               return i;
            }
         }
         return -1;
    }
}
