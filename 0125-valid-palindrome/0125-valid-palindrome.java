class Solution {
    public boolean isPalindrome(String s) {
        String st="";
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                st+=Character.toLowerCase(c);
            }
        }
        int n=st.length();
        for(int i=0;i<n/2;i++){
            if(st.charAt(i)!=st.charAt(n-i-1))
            return false;
        }
        return true;
    }
}