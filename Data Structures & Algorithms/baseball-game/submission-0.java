class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];
            if (op.equals("+")) {
                int top = st.pop();
                int newScore = top + st.peek();
                st.push(top);
                st.push(newScore);
            } else if (op.equals("D")) {
                st.push(2 * st.peek());
                
            } else if (op.equals("C")) {
                st.pop();
                
            } else {
                st.push(Integer.parseInt(op));
            }
        }
        
        int sum = 0;
       while(!st.isEmpty()){
        sum+=st.pop();
       }
        return sum;
    }
}