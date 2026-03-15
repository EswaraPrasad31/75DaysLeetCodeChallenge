class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       Set<Integer> s=new HashSet<>();
       Arrays.sort(nums);
       int n=nums.length;
       for(int ele:nums){
        s.add(ele);
       } 
       List<Integer> l=new ArrayList<>();
       for(int i=1;i<=n;i++){
        if(!s.contains(i)){
            l.add(i);
        }
       }
       return l;
    }
}