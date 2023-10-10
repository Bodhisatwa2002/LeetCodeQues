class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = Arrays.stream(weights).max().getAsInt(); //Minimum possible start
        int end = Arrays.stream(weights).sum(); //Maximum possible end

        while(start<=end){
            int mid = start+(end-start)/2;
            int numberOfDays = findDays(weights, mid);
            if(numberOfDays <= days){
                // we have to check minimum so we will check the left side
                end = mid -1;
            } else{
                // maybe we haven't found the possible ans
                start = mid+1;
            }
        }
        return start;
    }

    public int findDays(int[] weights, int cap){
        int days=1; // First day
        // this is the load that is filled in the ship one by one
        int load = 0;
        // weights is the array that is given in the question
        int n = weights.length;
        for (int i=0; i<n; i++){
            if(load + weights[i] > cap){
                // move the next day as the load have exceeded the capacity
                days += 1; 
                //load the weight on the new day
                load = weights[i];
            }
            else{
                load += weights[i];
            }
        }
        return days;
    }
}