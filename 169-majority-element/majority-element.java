class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int val = nums[0]; 
        int count = 1; 

        for (int i = 1; i < n; i++) { 
            if (nums[i] == val) {
                count++;
            } else {
                //when count is more than 0 decreaase its value by pairing up
                count--;
                if (count == 0) { 
                    val = nums[i]; //initialise new current value as the val 
                    count = 1; 
                }
            }
        }
        return val; 
    }
}
