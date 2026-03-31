class MinStack {
    Stack<Integer> st;
    List<Integer> l;
    public MinStack() {
        st=new Stack<>();
        l=new ArrayList<>();
    }
    
    public void push(int val) {
        st.push(val);
        l.add(val);
        Collections.sort(l);
    }
    
    public void pop() {
        l.remove(l.indexOf(st.pop()));
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return l.get(0);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */