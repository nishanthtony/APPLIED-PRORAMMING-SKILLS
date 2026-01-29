class MinStack {

    Stack<Integer> stack;
    Stack<Integer> min_stack;

    public MinStack() {

        stack = new Stack<>();
        min_stack = new Stack<>();
        
    }
    
    public void push(int val) {

        stack.push(val);

        if(min_stack.isEmpty() || val<= min_stack.peek())
        {
            min_stack.push(val);
        }

        else
        {
            min_stack.push(min_stack.peek());
        }
        
    }
    
    public void pop() {

        stack.pop();
        min_stack.pop();
        
    }
    
    public int top() {

        return stack.peek();
        
    }
    
    public int getMin() {

        return min_stack.peek();
        
    }
}
