class Solution {
    public boolean isValid(String s) {
       HashMap<Character,Character> h=new HashMap<>();
       h.put(')','(');
       h.put('}','{');
       h.put(']','[');
       Stack<Character> st=new Stack<>();
       for(char c:s.toCharArray()){
        if(c=='('||c=='{'||c=='['){
            st.push(c);
        }else{
            if(st.isEmpty()||h.get(c)!=st.pop())
            return false;
        }
       } 
       if(!st.isEmpty())
       return false;
       return true;
    }
}