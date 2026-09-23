
import java.util.*;
class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) 
    {
        List<String> list=new ArrayList<>();
        Set<String> st = new HashSet<>(wordDict);
        String par="";
        int i=0;
        dfs(s,st,i,par, list);
        return list;
    }
    public void dfs(String s, Set<String> st, int i, String par, List<String> list)
    {
        int n=s.length();
        if(i==n)
        list.add(par);
        else
        {
            for(int j=i; j<n; j++)
            {
                String word=s.substring(i,j+1);
                if(st.contains(word))
                {
                    String par2=par;
                    if(!par2.isEmpty())
                       par2+=" ";
                    par2+=word;
                    dfs(s,st,j+1,par2,list);
                }
            }
        }
    }
}