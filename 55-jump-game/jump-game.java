class Solution {
    public boolean canJump(int[] nums) {

    int lastIndex = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= lastIndex - i) {
                lastIndex = i;
            }
        }   

        return (lastIndex == 0) ? true : false;
    }

}