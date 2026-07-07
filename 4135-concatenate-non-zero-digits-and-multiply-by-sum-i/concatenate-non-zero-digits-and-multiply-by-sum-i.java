class Solution 
{
    public long sumAndMultiply(int n) 
    {
        String s=""+n;
        String x="";
        int sum=0;
        for (int i=0; i<s.length(); i++) 
        {
            if (s.charAt(i)!='0') 
            {
                x+=s.charAt(i);
                sum+=s.charAt(i)-'0';
            }
        }
        if (x.equals("")) 
            return 0;
        long num = Long.parseLong(x);
        return num * sum;
    }
}