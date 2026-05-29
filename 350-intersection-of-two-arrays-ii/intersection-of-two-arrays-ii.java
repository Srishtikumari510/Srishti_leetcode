class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
         
        int temp[]=new int[Math.min(n,m)];
        int count=0;
            for(int i=0;i<n;i++)
            {   
                for(int j=0;j< m;j++)
                {
                    if(nums1[i] == nums2[j])
                    {
                        temp[count]=nums2[j];
                        count++;
                        nums2[j]=-1;
                        break;
                    }
                }
            }
        int[] ans=new int[count];
        for(int i=0;i<count;i++)
        {
            ans[i]=temp[i];
        }

        return ans;


    }
}