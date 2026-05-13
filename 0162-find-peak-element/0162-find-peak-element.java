class Solution {
    public int findPeakElement(int[] nums) {
        int max=Integer.MAX_VALUE;
        int n=nums.length;
        int low=0;
        int high=n-1;
        int res=-1;
        HashMap<Integer,List<Integer>> h=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!h.containsKey(nums[i])){
                List<Integer> l=new ArrayList<>();
                l.add(i);
                h.put(nums[i],l);
            }else{
                List<Integer> l=h.get(nums[i]);
                l.add(i);
                h.put(nums[i],l);
            }
        }
        Arrays.sort(nums);
        List<Integer> l=h.get(nums[n-1]);
        return l.get(0);
        
    }
}