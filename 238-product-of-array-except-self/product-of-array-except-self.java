class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixProd = new int[n];
        prefixProd[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefixProd[i] = prefixProd[i - 1] * nums[i];
        }
        int suffix = 1;
        for (int i = n - 1; i > 0; i--) {
            prefixProd[i] = prefixProd[i - 1] * suffix;
            suffix = suffix * nums[i];
        }
        prefixProd[0] = suffix;
        return prefixProd;
    }
}
