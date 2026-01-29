class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for(int num : asteroids)
        {
            Boolean alive=true;

            while(alive && !stack.isEmpty() && stack.peek()>0 && num<0 )
            {
                int top = stack.peek();

                if(top<-num)
                {
                    stack.pop();
                }
                else if(top==-num) 
                {
                    stack.pop();
                    alive=false;
                }
                else{
                    alive=false;
                }
            }

            if(alive)
            {
                stack.push(num);
            }
        }

        int[] result = new int[stack.size()];

        for(int i=result.length-1;i>=0 ; i--)
        {
            result[i]= stack.pop();
        }

        return result;

    }
}
