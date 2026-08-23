class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean she=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j&&arr[i]==2*arr[j]  )
                {
                    she=true;
                }
            }
        }

        return she;
    }
}