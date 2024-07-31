class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    
//This code is remove efficient - remove complexity 0(1);
// but addition complexity is 0(N)
    public MyQueue() {
        stack1= new Stack<Integer>();
        stack2= new Stack<Integer>();

    }
    
    public void push(int x) {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int push = stack2.push(x);
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }
    
    public int pop() {
      return  stack1.pop();
    }
    
    public int peek() {
      return  stack1.peek();
    }
    
    public boolean empty() {
        return stack1.isEmpty();
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