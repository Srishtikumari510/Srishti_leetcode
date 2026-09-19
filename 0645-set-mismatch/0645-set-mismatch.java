class Solution {
    public int[] findErrorNums(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;
        int[] save = new int[2];

        // Find duplicate
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                save[0] = nums[i];
                break;
            }
        }

        // Find missing using sum
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        save[1] = expectedSum - (actualSum - save[0]);

        return save;
    }
}