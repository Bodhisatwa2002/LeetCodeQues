class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] preProduct = new int[n];
        preProduct[0] = nums[0];
        for (int i = 1; i < n; i++) {
            preProduct[i] = preProduct[i - 1] * nums[i];
        }
        int suffix = 1;
        for (int i = n - 1; i > 0; i--) {
            preProduct[i] = preProduct[i - 1] * suffix;
            suffix = suffix * nums[i];
        }
        preProduct[0] = suffix;
        return preProduct;
    }
}
