class Solution {
    public int arithmeticTriplets(int[] nums, int diff) 
    {
        int n=nums.length;
        int count=0;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                for(int k=0; k<n; k++)
                {
                    if((i<j && j<k) && (nums[j]-nums[i]==diff) && (nums[k]-nums[j]==diff) && (i!=j && j!=k && k!=i))
                    count++;
                }
            }
        }  
        return count;  
    }
}