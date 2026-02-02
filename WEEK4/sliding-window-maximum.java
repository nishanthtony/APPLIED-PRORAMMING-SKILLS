class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        List<Integer> output = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        
        int l = 0, r = 0;
        
        while (r < nums.length) {
            
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[r]) {
                deque.removeLast();
            }
            
            deque.addLast(r); 

            if (deque.peekFirst() < l) {
                deque.removeFirst();
            }

            if ((r + 1) >= k) {
                output.add(nums[deque.peekFirst()]);
                l++; 
            }
            
            r++;
        }
        
        int[] result = new int[output.size()];
        for (int i = 0; i < output.size(); i++) {
            result[i] = output.get(i);
        }
        
        return result;
    }
}
