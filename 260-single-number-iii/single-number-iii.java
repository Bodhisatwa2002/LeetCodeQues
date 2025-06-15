class Solution {
    public int[] singleNumber(int[] nums) {
        int v=0;
        for(int i=0;i<nums.length;i++){
            v=v^nums[i];
        }
        int idx=0;
        for(int i=0;i<32;i++){
            if(checkBit(v,i)==true){
                idx=i;
                break;
            }
        }
        int set1=0;
        int set2=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(checkBit(num,idx)==true){
                set2=set2^num;
            }else{
                set1=set1^num;
            }
        }
        return new int[]{set1, set2};
    }
    public boolean checkBit(int n,int i){
        if((n & (1<<i))!=0){
            return true;
        }
        else {
            return false;
        }
    }
}