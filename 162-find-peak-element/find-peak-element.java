class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1){return 0;}
        if(nums[0]>nums[1]){return 0;}
        if(nums[n-1]>nums[n-2]){return n-1;}
        int l=1;
        int h=n-2;
        while(h>=l){
            int m = l+(h-l)/2;
            if(nums[m]>nums[m-1] && nums[m]>nums[m+1]){
                return m;
            }
            else if(nums[m-1]>nums[m]){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return -1;
    }
}