class Solution {
    public int threeSumClosest(int[] nums, int target) {

        // Step 1: Sort the array
        Arrays.sort(nums);

        int n = nums.length;

        // Initialize closest sum with first 3 elements
        int closest = nums[0] + nums[1] + nums[2];

        // Step 2: Fix one element and use two pointers
        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                // Update closest if current sum is nearer to target
                if (Math.abs(target - sum) < Math.abs(target - closest)) {
                    closest = sum;
                }

                // If exact target found
                if (sum == target) {
                    return sum;
                }

                // Move pointers
                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closest;
    }
}