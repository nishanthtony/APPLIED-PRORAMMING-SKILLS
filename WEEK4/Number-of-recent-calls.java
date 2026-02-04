class RecentCounter {

    Queue<Integer> recent_count;

    public RecentCounter() {

        recent_count = new LinkedList<>();
        
    }
    
    public int ping(int t) {

        recent_count.add(t);

        while(recent_count.peek() < t-3000)
        {
            recent_count.poll();
        }

        return recent_count.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
