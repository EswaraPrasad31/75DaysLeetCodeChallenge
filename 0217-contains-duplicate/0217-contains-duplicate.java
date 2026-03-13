class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        for(int ele:nums){
            if(h.contains(ele))
            return true;
            h.add(ele);
        }
        return false;
    }
}