class Solution {
    public int findFirstOccurrence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int first = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                first = mid;
                end = mid - 1; // Continue searching for the first occurrence on the left side.
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return first;
    }

    public int findLastOccurrence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int last = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                last = mid;
                start = mid + 1; // Continue searching for the last occurrence on the right side.
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return last;
    }

    public int[] searchRange(int[] nums, int target) {
        int first = findFirstOccurrence(nums, target);
        if (first == -1) {
            return new int[]{-1, -1};
        }
        int last = findLastOccurrence(nums, target);
        return new int[]{first, last};
    }
}
