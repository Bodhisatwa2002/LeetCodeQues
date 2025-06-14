class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<32;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(checkBit(nums[j],i)==true){
                    count++;
                }
            }
            if(count%3==1){
                ans=ans+(1<<i);
            }
        }
        return ans;
    }
    public boolean checkBit(int n, int i) {
        return ((1<<i) & n) != 0;
    }
}