class Solution {
    public String truncateSentence(String s, int k) 
    {
        int c=0; int a=0;
        s=s+" ";
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==' ')
            {
                c++;
                if(c==k)
                a=i;
            }
        }    
        return s.substring(0,a);
    }
}