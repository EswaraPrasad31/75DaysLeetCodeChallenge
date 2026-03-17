class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int ele:nums){
            h.put(ele,h.getOrDefault(ele,0)+1);
        }
        List<Integer> pq=new ArrayList<>();
        for(int ele:h.keySet()){
            pq.add(ele);
        }
        Collections.sort(pq,(a,b)->h.get(b)-h.get(a));
        System.out.println(pq);
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.get(i);
        }
        return ans;
    }
}