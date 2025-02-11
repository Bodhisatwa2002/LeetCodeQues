class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int h =nums.length-1;
        while(h>=l){
            int m = l+(h-l)/2;
            if(nums[m]==target){
                return m;
            }
            if(nums[m]>target){
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return -1;
    }
}