class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s=new Stack<>();
        String operators="+-*/";
        int n=tokens.length;
        for(int i=0;i<n;i++){
            if(!operators.contains(tokens[i])){
                s.push(tokens[i]);
            }else{
                int res=0;
                int b=Integer.parseInt(s.pop());
                System.out.println("b"+b);
                int a=Integer.parseInt(s.pop());
                System.out.println("a"+a);
                if(tokens[i].equals("+")){
                    res=a+b;
                }else if(tokens[i].equals("-")){
                    res=a-b;
                }else if(tokens[i].equals("*")){
                    res=a*b;
                }else if(tokens[i].equals("/")){
                    if(b!=0)
                    res=a/b;
                }
                s.push(String.valueOf(res));
            }
        }
        return Integer.parseInt(s.pop());
    }
}