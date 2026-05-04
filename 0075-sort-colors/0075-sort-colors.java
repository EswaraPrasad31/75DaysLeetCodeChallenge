class Solution {
    public void sortColors(int[] nums) {
        int[] cnt=new int[3];
        for(int ele:nums){
            cnt[ele]++;
        }
        int k=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<cnt[i];j++){
                nums[k++]=i;
            }
        }
    }
}