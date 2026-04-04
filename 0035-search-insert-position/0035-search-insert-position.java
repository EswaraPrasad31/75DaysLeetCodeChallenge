class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,h=nums.length-1;
        int min=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                min=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        // if(target<nums[0])
        // return 0;
        return min+1;
    }
}