class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int val1 = nums[0];
        int count1 = 1;
        int val2 = nums[0];
        int count2 = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] == val1) {
                count1++;
            } else if (nums[i] == val2) {
                count2++;
            } else if (count1 == 0) {
                val1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                val2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == val1) {
                count1++;
            } else if (num == val2) {
                count2++;
            }
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3) {
            result.add(val1);
        }
        if (count2 > n / 3) {
            result.add(val2);
        }

        return result;
    }
}