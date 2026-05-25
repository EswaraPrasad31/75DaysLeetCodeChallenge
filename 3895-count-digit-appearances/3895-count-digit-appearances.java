class Solution {
    static int check(int x,int y){
        int ans=0;
        while(x>0){
            int digit=x%10;
            if(digit==y){
                ans++;
            }
            x/=10;
        }
        return ans;
    }
    public int countDigitOccurrences(int[] nums, int digit) {
        int n=nums.length;
        int count=0;
        for(int x:nums){
            count+=check(x,digit);
        }
        return count;
    }
}