class MyQueue {

    Stack<Integer> inq;
    Stack<Integer> outq;

    public MyQueue() {

        inq = new Stack<>();
        outq= new Stack<>();
        
    }
    
    public void push(int x) {

        inq.push(x);
        
    }
    
    public int pop() {

        Moveifneeded();
        return outq.pop();
        
    }
    
    public int peek() {

        Moveifneeded();
        return outq.peek();
        
    }
    
    public boolean empty() {

        return outq.isEmpty() && inq.isEmpty() ; 
        
    }

    private void Moveifneeded()
    {

        if(outq.isEmpty())
        {
            while(!inq.isEmpty())
            {
                outq.push(inq.pop());
            }

        }

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
