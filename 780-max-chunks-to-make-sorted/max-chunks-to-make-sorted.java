class Solution {
    public int maxChunksToSorted(int[] arr) {
        int maxTillNow = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            maxTillNow = Math.max(maxTillNow, arr[i]);
            if (maxTillNow == i) {
                count++;
            }
        }
        return count;
    }
}