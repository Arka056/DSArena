class MyStack {
    Queue<Integer> q = new LinkedList<Integer>();
    public MyStack() {

    }
    
    public void push(int x) {
        q.add(x);
        for(int i = 0; i < q.size() -1; i++){
            q.add(q.remove());
        }
    }
    
    public int pop() {
        if(q.isEmpty()) return -1;
        int x = q.remove();
        return x;
    }
    
    public int top() {
        if(q.isEmpty()) return -1;
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */