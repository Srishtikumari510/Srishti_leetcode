class Solution {
    public int longestValidParentheses(String s) {

       Stack<Integer>a=new Stack<>();
        int count=0;
        a.push(-1);
       for(int i=0;i<s.length();i++)
       {    
           char ch=s.charAt(i);
               if(ch=='(')
               {
                     
                     a.push(i);

               }
               else
               {
                 a.pop();

                 if(a.isEmpty())
                 {
                    a.push(i);

                 }
                 else
                 {
                    int length=i-a.peek();
                    count=Math.max(count,length);
                 }
               }

       }

        return count;

    }
}