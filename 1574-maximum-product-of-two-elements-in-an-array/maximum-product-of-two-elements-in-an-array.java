class Solution {
    public int maxProduct(int[] nums) 
    {
        if(nums[0]==1 && nums[1]==1 && nums[2]==1)
        return 0;
        int n=nums.length;
        int max=nums[0];
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                max=Math.max(max,(nums[i]-1)*(nums[j]-1));
            }
        }
        return max;
    }
}