class Solution 
{
    public int totalFruit(int[] fruits) 
    {
        int k=2;
        int l=0; int r=0;
        int max=0;
        Map<Integer, Integer> mp=new HashMap<>();
        while(r<fruits.length) 
        {
            mp.put(fruits[r],mp.getOrDefault(fruits[r],0)+1);
            if (mp.size() > k)
            {
                while (mp.size() > k)
                {
                    mp.put(fruits[l], mp.get(fruits[l]) - 1);
                    if (mp.get(fruits[l]) == 0)
                    {
                       mp.remove(fruits[l]);
                    }
                    l++;
                }
            }
            if(mp.size()<=k)
            {
                max=Math.max(max,r-l+1);
            }
            r++;
        }       
        return max;
    }
}