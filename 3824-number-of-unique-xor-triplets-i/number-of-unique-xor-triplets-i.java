class Solution {
    public int uniqueXorTriplets(int[] nums) {
        return (nums.length < 3) ? nums.length : (int)(Math.pow(2,32 - Integer.numberOfLeadingZeros(nums.length)));
    }
}