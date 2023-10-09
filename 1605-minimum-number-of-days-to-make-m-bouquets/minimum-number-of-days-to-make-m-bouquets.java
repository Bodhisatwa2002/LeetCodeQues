class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m*k;
        int n = bloomDay.length;
        //This is the case when flowers are less and we have to make more bouquets consisting of flowers
        if (val > n) return -1;

        //Now find maximum and minimum in range so that we can search in the array with BS
        int mini = Integer.MAX_VALUE, maxi= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mini = Math.min(mini, bloomDay[i]);
            maxi = Math.max(maxi, bloomDay[i]);
        }

        // Now we will apply BS to see which is the minimum possible value
        int start= mini, end = maxi;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(possible(bloomDay,mid,m,k)){
                //Here actually we are seeing if the case is possible then we will search in the left hadn side of the array as we have to find the minimum one
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        // we are returning start as our answer bcz when the loop gets over 
        return start;
    }

    public boolean possible(int[]arr, int day, int m , int k){
        int n= arr.length;
        int cnt = 0;
        int noOfB =0;

        //count the number of bouquets
        for(int i=0;i<n; i++){
            if(arr[i] <= day){
                //it means that if the day we have choosed on that day how many flowers have bloomed we will check this individually
                cnt++;
            }
            else{
                noOfB += (cnt/k);
                cnt=0;
            }
        }
        noOfB += (cnt/k);
        //this means if bouquets more than m than it will return true
        return noOfB >= m;
    }
}