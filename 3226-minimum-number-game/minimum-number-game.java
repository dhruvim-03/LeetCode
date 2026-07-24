class Solution 
{
    public int[] numberGame(int[] nums) 
    {
        Arrays.sort(nums);
        int[] out=new int[nums.length];
        for(int i=0;i<nums.length;i+=2)
        {
            out[i]=nums[i+1];
            out[i+1]=nums[i];
        }
        return out; 
    }
}