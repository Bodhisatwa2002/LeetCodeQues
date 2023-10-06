public class Solution {
    public static int searchInsert(int [] arr, int x){
        // Write your code here.
                //what if target is greater than greatest number in the array
        
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        if(x > arr[n-1]){
            return n;
        }

        while(start <= end){
            //find the middle element
            int mid = start + (end - start) / 2 ;
            if(x < arr[mid]){
                end = mid -1;
            } else if (x > arr[mid]) {
                start = mid + 1;
            }
            else{
                // if middle element is the target element then
                return mid ;
            }
        }
        return start;
    }
}