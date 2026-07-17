class Solution 
{
    public int subsetXORSum(int[] nums) 
    {
        int t=0;
        for(int i:nums)
            t|=i;
        return t<<(nums.length-1);
    }
}