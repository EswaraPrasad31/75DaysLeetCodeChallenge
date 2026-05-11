class Solution {
    public String decodeString(String s) {
        Stack<Integer> val=new Stack<>();
        Stack<StringBuilder> str=new Stack<>();
        StringBuilder sb=new StringBuilder();
        int k=0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                k=k*10+(ch-'0');
            }else if(ch=='['){
                val.push(k);
                str.push(sb);
                sb=new StringBuilder();
                k=0;
            }else if(ch==']'){
                int repeat=val.pop();
                StringBuilder decode=str.pop();
                for(int i=0;i<repeat;i++){
                    decode.append(sb);
                }
                sb=decode;
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}