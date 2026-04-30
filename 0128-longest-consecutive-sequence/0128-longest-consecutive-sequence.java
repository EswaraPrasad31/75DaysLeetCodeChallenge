class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> s=new TreeSet<>();
        int min=Integer.MAX_VALUE;
        for(int ele:nums){
            s.add(ele);
            min=Math.min(ele,min);
        }
        int x=min;
        int count=0;
        int ans=0;
        for(int key:s){
            if(key-1==x){
                count++;
            }else{
                count=1;
            }
            x=key;
            System.out.println(key+" "+count);
            ans=Math.max(ans,count);
        }
        ans=Math.max(ans,count);
        return ans;
    }
}