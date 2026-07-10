class Solution {
    public String reversePrefix(String word, char ch) 
    {
        int idx=word.indexOf(ch);
        if (idx==-1)
            return word;
        String str = "";
        for (int i=idx; i>=0; i--)
            str += word.charAt(i);
        for (int i=idx+1; i<word.length(); i++)
            str += word.charAt(i);

        return str;
    }
}