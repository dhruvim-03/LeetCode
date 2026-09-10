class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int n = s.length();
        int hash[] = new int[256];
        for (int i = 0; i < 256; i++)
            hash[i] = -1;

        int l = 0, r = 0, max = 0;

        while (r < n)
        {
            char c = s.charAt(r);
            if (hash[c] != -1 && hash[c] >= l)
                l = hash[c] + 1;

            int len = r - l + 1;
            max = Math.max(len, max);

            hash[c] = r;
            r++;
        }

        return max;
    }
}