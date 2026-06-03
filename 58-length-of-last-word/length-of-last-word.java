class Solution {
    public int lengthOfLastWord(String s) {
        
      s=s.trim();
      int n=s.length();

      int t=(s.lastIndexOf(' '))+1;
    
      return n-t;
    }
}