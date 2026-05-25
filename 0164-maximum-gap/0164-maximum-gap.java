class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        if(n<2)
        return 0;
        int ans=Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            ans=Math.max(ans,nums[i]-nums[i-1]);
        }
        return ans;
    }
}