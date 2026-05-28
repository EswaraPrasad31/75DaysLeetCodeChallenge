class Solution {
    static String count(String s){
        StringBuilder sb=new StringBuilder();
        int cnt=1;
        int n=s.length();
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                cnt++;
            }else{
                sb.append((char)(cnt+'0')).append(s.charAt(i));
                cnt=1;
            }
        }
        sb.append((char)(cnt+'0')).append(s.charAt(n-1));
        return sb.toString();
    }
    public String countAndSay(int n) {
        String[] s=new String[n];
        s[0]="1";
        for(int i=1;i<n;i++){
            s[i]=count(s[i-1]);
        }
        for(String x:s){
            System.out.println(x);
        }
        return s[n-1];
    }
}