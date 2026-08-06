class Solution {
    public int smallestNumber(int n, int t) {

        for (int i = n; ; i++) {

            if (i == 0) {
                if (0 % t == 0)
                    return 0;
                continue;
            }

            int prod = 1;
            int temp = i;

            while (temp > 0) {
                prod *= temp % 10;
                temp /= 10;
            }

            if (prod % t == 0)
                return i;
        }
    }
}