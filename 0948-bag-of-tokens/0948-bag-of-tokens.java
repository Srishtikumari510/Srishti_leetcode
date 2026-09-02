class Solution { 
    public int bagOfTokensScore(int[] tokens, int power) { 
        int n = tokens.length; 
 
        if (n == 0)
         { 
                return 0;     
          } 

     int score=0;
     int max=0;
      int left=0;
      int right=n-1;
      Arrays.sort(tokens);
      while(left<=right){

     if(tokens[left]<=power)
      {
        score++;
        power-=tokens[left];
        left++;
        max=Math.max(max,score);

      }
       else if(score>0)
      {
        score--;
        power+=tokens[right];
        right--;

      }
         
         else
         {
            break;
         }

      }
     

    return max; 
      


 }
}