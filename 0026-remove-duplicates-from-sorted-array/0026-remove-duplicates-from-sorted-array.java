class Solution {
    public int removeDuplicates(int[] nums) {
   


    HashSet<Integer>set=new HashSet<>();
    ArrayList<Integer>ans=new ArrayList<>();

for(int i=0;i<nums.length;i++)
{
    if(!set.contains(nums[i]))
    {
       set.add(nums[i]);
       ans.add(nums[i]);
 
    }
}
for(int i=0;i<ans.size();i++)
{
    nums[i]=ans.get(i);
}
   return ans.size();

}}