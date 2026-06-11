class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int n=nums.length;

       
       HashSet<Integer>h=new HashSet<>();
        for(int s:nums)
        {
            h.add(s);
        }
    
    ArrayList<Integer>a=new ArrayList<>();

        for(int i=1;i<=n;i++)
        {
            if(!h.contains(i))
            {
                a.add(i);
            }


        }

        return a;
    }

}