package Array_2;
//trapped water = (water level(height of side bar) -height of the bar) * width of the bar
//watter level = min(left max, right max) 
// get leftmax and rightmax for each bar in array
public class trappingRainwater {

    public static void water(int arr[] , int width){
        int n= arr.length;
        int leftmax[] = new int[n];
        int rightmax[] = new int[n];
        rightmax[n-1] = arr[n-1];
        leftmax[0] = arr[0];

        //left max
        for(int i =1; i<n; i++){
            leftmax[i] = Math.max(arr[i], leftmax[i-1]);
        }
        for(int j= n-2 ; j>=0; j--){
            rightmax[j] = Math.max(arr[j], rightmax[j+1]);
        }

        // loop for trapped water
        // ans = (water level - height of bar) * width of bar
        int ans =0;
        for(int i = 0; i<n ; i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
       ans += (waterlevel- arr[i] )* width;
               
        }

         System.out.print(ans + " ");
    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        int width =1;
        water(arr , width);
    }
}
