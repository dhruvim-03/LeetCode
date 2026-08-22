class Solution {
    public boolean checkDivisibility(int n) 
    {
        int sum=0; int prod=1;
        int temp=n;
        while(n!=0)
        {
            int rev=n%10;
            sum+=rev;
            prod*=rev;
            n/=10;
        }    
        if(temp%(sum+prod)==0)
        return true;
        else
        return false;
    }
}