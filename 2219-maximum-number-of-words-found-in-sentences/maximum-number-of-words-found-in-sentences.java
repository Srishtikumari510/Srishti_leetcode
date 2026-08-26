class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;

        for(String sentence:sentences)
        {
          int  wordcount=sentence.split(" ").length;

          if(wordcount>max)
          {

              max=wordcount;
          }
        }

        return max;
    }
}