class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        k=k%n;
        reversePart(nums, 0, n - 1);       
        reversePart(nums, 0, k - 1);
        reversePart(nums, k, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void reversePart(int[]arr, int s, int e){
        int sp = s;
        int ep = e;
        while(sp < ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }

    }
}