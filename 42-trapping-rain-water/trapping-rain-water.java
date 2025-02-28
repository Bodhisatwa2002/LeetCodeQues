class Solution {
    public int trap(int[] height) {
        int n= height.length;
        if (n == 0) return 0;
        int [] prefixMax= new int[n];
        int [] sufixMax= new int[n];
        //finding the pMax
        prefixMax[0]=height[0];
        for(int i=1;i<n;i++){
            prefixMax[i]=Math.max(prefixMax[i-1],height[i]);
        }
        //finding the sMax
        sufixMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            sufixMax[i]=Math.max(sufixMax[i+1],height[i]);
        }
        int amount=0;
        for (int i = 0; i < n; i++) {
            int lb = prefixMax[i];  // Left boundary
            int rb = sufixMax[i];  // Right boundary
            int yb = Math.min(lb, rb);  // Water level (yb = min(lb, rb))
            int contri = yb - height[i];  // Contribution to trapped water

            if (contri > 0) {
            amount += contri;
            }
        }
        return amount;


    }
}