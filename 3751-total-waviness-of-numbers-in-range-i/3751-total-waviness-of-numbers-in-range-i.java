class Solution {
    static int wave(int num){
        if(num<100)
        return 0;
        String s=String.valueOf(num);
        int n=s.length();
        int cnt=0;
        for(int i=1;i<n-1;i++){
            int x=s.charAt(i-1)-'0';
            int y=s.charAt(i)-'0';
            int z=s.charAt(i+1)-'0';
            if((y>x && y>z)||(y<x && y<z)){
                cnt++;
            }
        }
        return cnt;
    }
    public int totalWaviness(int num1, int num2) {
        int count=0;
        for(int i=num1;i<=num2;i++){
            count+=wave(i);
        }
        return count;
    }
}