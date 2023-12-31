class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start =1, end = findMax(piles);
        
        //apply BS
        while(start<= end){
            int mid = start + (end-start)/2;
            int totalH= calculateTotalHours(piles,mid);
            if(totalH <= h){
                end= mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }

    public int findMax(int[] piles){
        //now we set the maximum value as the most lowest value of integar
        int maxi= Integer.MIN_VALUE;
        int n= piles.length;
        for(int i=0; i<n; i++){
            maxi= Math.max(maxi,piles[i]);
        }
        return maxi;
        
    }

    public int calculateTotalHours(int[] piles, int hourly){
        int totalH= 0;
        int n=piles.length;
        for(int i=0;i<n;i++){
            totalH += Math.ceil((double) piles[i]/ (double) hourly);
        }
        return totalH;
    }
}