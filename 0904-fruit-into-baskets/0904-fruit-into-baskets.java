class Solution {
    public int totalFruit(int[] fruits) {
       HashMap<Integer,Integer> h=new HashMap<>();
       int i=0;
       int max=0;
       for(int j=0;j<fruits.length;j++){
            h.put(fruits[j],h.getOrDefault(fruits[j],0)+1);
            while(h.size()>2){
                h.put(fruits[i],h.get(fruits[i])-1);
                if(h.get(fruits[i])==0)
                h.remove(fruits[i]);
                i++;
            }
            max=Math.max(max,j-i+1);
       } 
       return max;
    }
}