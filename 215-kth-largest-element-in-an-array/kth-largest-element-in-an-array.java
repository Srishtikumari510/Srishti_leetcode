class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        Arrays.sort(nums);
        int n=nums.length;
        int temp=0;
        int t=n-k;

        for(int i=0;i<n;i++)
        {   
         
         temp=nums[t];

        }

        return temp;
    }
}