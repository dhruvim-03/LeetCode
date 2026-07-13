class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i=0; i<s.length()-1; i++)
        {
            int d=s.charAt(i)-s.charAt(i+1);
            if(d<0)
            d=-d;
            if(d>2)
            return false;
        }
        return true;
        
    }
}