class Solution {
    public int evalRPN(String[] tokens) {
     Stack<Integer>st=new Stack<>();
     for(String i:tokens)
     {
        if(i.equals("+")||
        i.equals("-")||
        i.equals("*")||
        i.equals("/")
      
        )
        { 
            int b=st.pop();
            int a=st.pop();

            if(i.equals("+"))
            {
                st.push(a+b);
            }
           else if(i.equals("-"))
            {
                st.push(a-b);
            }
           else if(i.equals("/"))
            {
                st.push(a/b);
            }

            else
            {
                st.push(a*b);
            }

        }



        else
        {
            st.push(Integer.parseInt(i));
        }



     }

     return st.pop();
    }
}