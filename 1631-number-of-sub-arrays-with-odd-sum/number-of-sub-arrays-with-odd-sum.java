class Solution {
    public int numOfSubarrays(int[] arr) {
        long count = 0, odd = 0, even = 1, prefix = 0;
        long MOD = 1_000_000_007L;

        for(int i=0; i<arr.length; i++) {
            prefix += arr[i];

            if(prefix % 2 == 0) {
                count += odd;
                even++;
            } else {
                count+= even;
                odd++;
            }
            count %= MOD;
        }
        return (int) count;
    }
}