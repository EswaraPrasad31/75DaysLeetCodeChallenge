class Solution {
    public int maxProfit(int[] prices) {
        int ans=0,max=Integer.MAX_VALUE;
        for(int ele:prices){
            if(ele<max){
                max=ele;
            }else{
                ans=Math.max(ans,ele-max);
            }
        }
        return ans;
    }
}