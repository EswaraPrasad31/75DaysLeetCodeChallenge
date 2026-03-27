class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        String st="";
        int ans=0;
        for(char c:s.toCharArray()){
            if(st.indexOf(c)!=-1){
                st=st.substring(st.indexOf(c)+1);
            }
            st+=c;
            ans=Math.max(ans,st.length());
        }
        return ans;
    }
}