class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> m=new HashMap<>();
       int n=nums2.length;
       Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && nums2[i]>=s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                m.put(nums2[i],-1);
            }else{
                m.put(nums2[i],s.peek());
            }
            s.push(nums2[i]);
        } 
        int h=nums1.length;
        int[] res=new int[h];
        int k=0;
        for(int ele:nums1){
            res[k++]=m.get(ele);
        }
        return res;
    }
}