class Solution {
    public int characterReplacement(String s, int k) {
        int[] cnt=new int[26];
        int i=0,max=0,ans=0;
        for(int j=0;j<s.length();j++){
            cnt[s.charAt(j)-'A']++;
            max=Math.max(max,cnt[s.charAt(j)-'A']);
            while((j-i+1)-max>k){
                cnt[s.charAt(i)-'A']--;
                i++;
            }
            ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}