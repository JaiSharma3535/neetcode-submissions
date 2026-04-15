class MinStack {
    Stack<Integer> st=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        st.add(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
       return  st.peek();
    }
    public int getMin() {
         if (st.isEmpty()) return 0;
        Stack<Integer> temp = new Stack<>();
        int min = Integer.MAX_VALUE;
        while (!st.isEmpty()) {
            int val = st.pop();
            min = Math.min(min, val);
            temp.push(val);
        }
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }

        return min;

    }
}
