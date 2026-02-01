class Solution {
    public int[] finalPrices(int[] prices) {

        Stack<Integer> stack = new Stack<>();

        int[] temp = prices.clone();

        int n = prices.length;

        for(int i=0 ; i<n ; i++)
        {
            while(!stack.isEmpty() && prices[stack.peek()]>=prices[i])
            {
                int diff =prices[i]-prices[stack.peek()];
                temp[stack.pop()]=Math.abs(diff);
            }

            stack.push(i);
        }

        return temp;
        
    }
}
