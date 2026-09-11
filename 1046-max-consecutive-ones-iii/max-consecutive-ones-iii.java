class Solution {
    public int longestOnes(int[] nums, int k) 
    {
        int n = nums.length;
        int max=0;
        int len=0;
        for(int i=0; i<n; i++)
        {
            int zero=0;
            for(int j=i; j<n; j++)
            {
                if(nums[j]==0)
                   zero++;
                if(zero<=k)
                {
                    len=j-i+1;
                    max=Math.max(len,max);
                }
                else 
                break;
            }
        }
        return max;
    }
}