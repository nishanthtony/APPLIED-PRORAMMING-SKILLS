class Solution {
    public int longestSubarray(int[] nums, int limit) {

        Deque<Integer>  maxdeque = new ArrayDeque<>();
        Deque<Integer> mindeque = new ArrayDeque<>();

        int left=0;
        int result=0;

        for(int right =0; right<nums.length ; right++)
        {
            while(!maxdeque.isEmpty() && nums[right]>maxdeque.peekLast())
            {
                maxdeque.pollLast();
            }

            maxdeque.offerLast(nums[right]);

            while(!mindeque.isEmpty() && nums[right]<mindeque.peekLast())
            {
                mindeque.pollLast();
            }

            mindeque.offerLast(nums[right]);

            while(maxdeque.peekFirst() - mindeque.peekFirst()>limit)
            {
                if(nums[left]==maxdeque.peekFirst())
                {
                    maxdeque.pollFirst();
                }

                if(nums[left]==mindeque.peekFirst())
                {
                    mindeque.pollFirst();
                }

                left++;
            }

            result = Math.max(result,right-left+1);
        }

        return result;


        
    }
}
