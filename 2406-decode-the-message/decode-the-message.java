class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        char ch='a';
        for(int i=0;i<key.length();i++){
            if(key.charAt(i)==' '){
                continue;
            }
            else{
                if(!map.containsKey(key.charAt(i))){
                map.put(key.charAt(i), ch++);
            }
            }
        }
        String m = "";
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)!=' '){
                m=m+map.get(message.charAt(i));
            }
            else{
                m = m+' ';
            }
        }
        return m;
    }
}