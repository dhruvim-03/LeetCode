class Solution 
{
    public long countCommas(long n) 
    {
        long ans=0;
        long base=1000;
        for(int i=1; i<6; i++)
        {
            ans+=(long)Math.max(0,n-base+1);
            base*=1000;
        } 
        return ans;
    }
}