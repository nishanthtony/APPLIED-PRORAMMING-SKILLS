class Solution {
    public String minRemoveToMakeValid(String s) {

        int count=0;

        char[] temp = s.toCharArray();

        for(int i=0 ; i<temp.length ; i++)
        {

            if(temp[i]=='(')
            {
                count++;
            }
            else if(temp[i]==')')
            {
                if(count>0){
                    count--;
                }
                else{
                    temp[i]=0;
                }
            }

        }

        int count2=0;

        for(int i=temp.length-1 ; i>=0 ; i--)
        {

            if(temp[i]==')')
            {
                count2++;
            }
            else if(temp[i]=='(')
            {
                if(count2>0){
                    count2--;
                }
                else{
                    temp[i]=0;
                }
            }

        }

        StringBuilder result  = new StringBuilder();

        for(char ch : temp)
        {
            if(ch!=0)
            {
                result.append(ch);
            }
        }

        return result.toString();

        
    }
}
