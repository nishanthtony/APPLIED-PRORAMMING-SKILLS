class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int[] result = new int[nums1.length];
        
        Stack<Integer> stack = new Stack<>();

        for(int n : nums2)
        {
            while(!stack.isEmpty() && n>stack.peek())
            {
                map.put(stack.pop(),n);
            }

            stack.push(n);
        }

        while(!stack.isEmpty())
        {
            map.put(stack.pop(),-1);
        }

        for(int i=0 ; i<nums1.length ; i++)
        {
            result[i]=map.get(nums1[i]);
        }
        
        return result;
    }
}
