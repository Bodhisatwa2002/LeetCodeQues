class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] cont = new int[102];

        for (int num: nums){
            cont[num] ++;
        }

        for(int i =1; i< cont.length; i++ ){
            cont[i] += cont[i-1];
        }

        int[] result = new int[nums.length];
        for(int i=0; i<result.length; i++){
            if(nums[i]==0){
                result[i] =0;
            }
            else 
            result[i] = cont[nums[i] - 1];
        }
        return result;
    }
}