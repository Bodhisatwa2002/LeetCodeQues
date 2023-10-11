class Solution {
     public void moveZeroes(int[] nums) {
        int boxOfZeroes = 0; 
        for (int i=0;i<nums.length;i++){
	        if (nums[i]==0){
                boxOfZeroes++; 
            }
            else if (boxOfZeroes > 0) {
	            int t = nums[i];
	            nums[i]=0;
	            nums[i-boxOfZeroes]=t;
            }
        }
    }
}