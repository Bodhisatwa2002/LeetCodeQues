class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        //this means if the no of elements in the array is more then the threshold value then its not possible
        if(n>threshold) return -1;

        // maximum element
        int maxi= Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            maxi= Math.max(maxi, nums[i]);
        }

        int start =1, end=maxi;

        //Apply BS
        while(start<=end){
            int mid= start+(end-start)/2;
            if(SumByD(nums,mid) <= threshold){
                // we have to find minimum value so we will look in the left hand side and check whether there are any minimum numbers avialable or not
                end = mid-1;
            }
            else{
                start= mid+1;
            }
        }
        return start;
    }

    // now we will divide everything by given number and we will add the values
    public int SumByD(int[]arr , int div){
        int n= arr.length;
        //find summation
        int sum=0;
        for(int i=0; i<n;i++){
            sum += Math.ceil((double) arr[i]/ (double) div);
        }
        return sum;
    }
}