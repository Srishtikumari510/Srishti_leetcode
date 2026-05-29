class Solution {
    public void moveZeroes(int[] nums) {

        int n = nums.length;
        int k = 0;

        int temp[] = new int[n];

        for (int i = 0; i < n; i++) {

            if (nums[i] != 0) {
                temp[k] = nums[i];
                k++;
            }
        }

        while (k < n) {
            temp[k] = 0;
            k++;
        }

        // Copy temp array back to nums
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}