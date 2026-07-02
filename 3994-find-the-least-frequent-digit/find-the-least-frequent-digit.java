class Solution {
    public int getLeastFrequentDigit(int n) 
    {
        Map<Integer,Integer> mp=new HashMap<>();
        while(n!=0)
        {
            int rev=n%10;
            mp.put(rev,mp.getOrDefault(rev,0)+1);
            n/=10;
        }    
        int ans=-1;
        int min=Integer.MAX_VALUE;
        for (int i=0; i<=9; i++) 
        {
            if (mp.containsKey(i)) 
            {
                int freq = mp.get(i);
                if (freq < min) 
                {
                    min = freq;
                    ans = i;
                }
            }
        }
        return ans;
    }
}