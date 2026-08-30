class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
     int count=0;
    for(String word:words)
    {
        boolean ok=true;

        for(char c:word.toCharArray())
        {
            if(!allowed.contains(String.valueOf(c)))
            {
                ok=false;
                break;
            }
        }

        if(ok)
        {
            count++;
        }
    }
  return count;




}}