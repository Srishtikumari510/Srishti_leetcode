class Solution {
    public boolean isPalindrome(String s) {
        
         String low=s.toLowerCase();
         String p=low.replaceAll("[^a-z0-9]","");
        int n=p.length();
        int left=0;
        int right=n-1;
        
        while(left<right)
        {
            if(p.charAt(left)!=p.charAt(right))
            { 
               return false;
               
            }
                left++;
                right--;
            
        }

        return true;



    }
}