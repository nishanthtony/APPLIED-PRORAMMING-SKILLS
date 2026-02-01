class Solution {
    public boolean isValid(String s) {

        Map<Character,Character> map = Map.of('{','}','[',']','(',')');

        Stack<Character> stack = new Stack<>();

        for(Character ch : s.toCharArray())
        {
            if(map.containsKey(ch))
            {
                stack.push(map.get(ch));
            }
            else
            {
                if(stack.isEmpty() || stack.pop()!=ch)
                {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
