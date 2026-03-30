class MyQueue {
    Stack<Integer> st;
    public MyQueue() {
        st=new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        Stack<Integer> s=new Stack<>();
        while(!st.isEmpty()){
            s.push(st.pop());
        }
        int ans=s.pop();
        while(!s.isEmpty()){
            st.push(s.pop());
        }
        return ans;
    }
    
    public int peek() {
        Stack<Integer> s=new Stack<>();
        while(!st.isEmpty()){
            s.push(st.pop());
        }
        int ans=s.peek();
        while(!s.isEmpty()){
            st.push(s.pop());
        }
        return ans;
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */