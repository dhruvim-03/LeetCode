class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();

        int count = 0;

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(c == '(') {
                st.push(i);
            } else {
                if(!st.isEmpty()) {
                    st.pop();
                } else {
                    count++;
                }
            }
        }

        while(!st.isEmpty()) {
            st.pop();
            count++;
        }

        return count;
    }
}