class Solution 
{
    public boolean isValid(String s) 
    {
        Stack<Character> st=new Stack<>();
        int l=s.length();
        for(char ch: s.toCharArray()) //Iterating through each character of the string by converting it into character array
        {
            if(ch=='(' || ch=='{' || ch=='[') 
                st.push(ch); // pushing the character in the stack only if it is an opening bracket
            else
            {
                if(st.size()==0)
                   return false;  // eg: s=")" : nothing to push so notthing to be popped out
                else
                {
                    if(isMatching(st.peek(),ch))
                        st.pop();
                    else
                        return false; 
                }
            }
        }    
        return st.size()==0;
    }
    public boolean isMatching(char a,char b)
    {
        if(a=='(' && b==')')
        return true;
        else if(a=='{' && b=='}')
        return true;
        else if(a=='[' && b==']')
        return true;
        else
        return false;
    }
}