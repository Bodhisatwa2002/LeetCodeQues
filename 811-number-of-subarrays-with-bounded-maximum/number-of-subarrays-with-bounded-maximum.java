class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int n = nums.length;
        int ans=0;
        int lgei=0;
        int preValidCount=0;
        for(int i=0;i<n;i++){
            if(nums[i]>right){
                preValidCount = 0;
                lgei=i+1;
            }
            else if(nums[i] >= left && nums[i] <= right){
                ans=ans+(i-lgei+1);
                preValidCount=i-lgei+1;
            }
            else{
                ans += preValidCount;
            }
        }
        return ans;
    }
}