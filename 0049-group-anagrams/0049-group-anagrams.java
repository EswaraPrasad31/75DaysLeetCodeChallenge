class Solution {
    static String sort(String s){
        char[] c=s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h=new HashMap<>();
        for(String s:strs){
            String sorted=sort(s);
            if(!h.containsKey(sorted)){
                h.put(sorted,new ArrayList<>());
            }
            h.get(sorted).add(s);
        }
        List<List<String>> l=new ArrayList<>();
        for(String s:h.keySet()){
            l.add(h.get(s));
        }
        return l;
    }
}