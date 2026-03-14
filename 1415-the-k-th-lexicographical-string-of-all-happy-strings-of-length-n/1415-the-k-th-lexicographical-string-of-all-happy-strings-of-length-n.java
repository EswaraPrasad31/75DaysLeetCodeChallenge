class Solution {
    static void rec(int n,StringBuilder s,List<String> l){
        if(s.length()==n){
            l.add(s.toString());
            return;
        }
        if(s.length()==0){
            s.append("a");
            rec(n,s,l);
            s.deleteCharAt(s.length()-1);
            s.append("b");
            rec(n,s,l);
            s.deleteCharAt(s.length()-1);
            s.append("c");
            rec(n,s,l);
            s.deleteCharAt(s.length()-1);
        }else{
            if(s.charAt(s.length()-1)=='a'){
                s.append("b");
                rec(n,s,l);
                s.deleteCharAt(s.length()-1);
                s.append("c");
                rec(n,s,l);
                s.deleteCharAt(s.length()-1);
            }else if(s.charAt(s.length()-1)=='b'){
                s.append("a");
                rec(n,s,l);
                s.deleteCharAt(s.length()-1);
                s.append("c");
                rec(n,s,l);
                s.deleteCharAt(s.length()-1);
            }else{
                s.append("a");
                rec(n,s,l);
                s.deleteCharAt(s.length()-1);
                s.append("b");
                rec(n,s,l);
                s.deleteCharAt(s.length()-1);
            }
        }

    }
    public String getHappyString(int n, int k) {
        List<String> l=new ArrayList<>();
        rec(n,new StringBuilder(),l);
        if(l.size()<k)
        return "";
        return l.get(k-1);
    }
}