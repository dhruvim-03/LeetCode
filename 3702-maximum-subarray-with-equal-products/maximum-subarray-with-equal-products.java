class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int maxLen = 1;
        
        // Max possible LCM(1..10) = 2520, Max possible GCD = 10 -> 2520 * 10 = 25200
        int MAX_LIMIT = 25200;

        for (int i = 0; i < n; i++) {
            int currProd = 1;
            int currGcd = nums[i];
            int currLcm = nums[i];

            for (int j = i; j < n; j++) {
                currProd *= nums[j];

                // Stop early to prevent integer overflow
                if (currProd > MAX_LIMIT) {
                    break;
                }

                currGcd = gcd(currGcd, nums[j]);
                currLcm = lcm(currLcm, nums[j]);

                if (currProd == currLcm * currGcd) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    // Helper for GCD of two numbers
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Helper for LCM of two numbers
    private int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}
