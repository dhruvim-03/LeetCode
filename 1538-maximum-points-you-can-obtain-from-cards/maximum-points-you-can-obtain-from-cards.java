class Solution {
    public int maxScore(int[] arr, int k) 
    {
        int n=arr.length;
        int lsum=0; int rsum=0;
        int max=0;
        for(int i=0; i<k; i++)
            lsum+=arr[i];
        int rin=n-1;
        max=lsum;
        for(int i=k-1; i>=0; i--)
        {
            lsum-=arr[i];
            rsum+=arr[rin];
            rin--;
            max=Math.max(max,(lsum+rsum));
        }
        return max;
    }
}