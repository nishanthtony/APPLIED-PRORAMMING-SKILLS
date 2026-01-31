class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] result;
        int head=0;
        int tail=n-1;

        result  = new int[n];

        for(int i=0;i<n;i++){

            nums[i]=nums[i]*nums[i];
        }

        for(int p=n-1;p>=0;p--)
        {
            if (nums[head]>nums[tail]){
                result[p]=nums[head];
                head++;
            }
            else{

                result[p]=nums[tail];
                tail--;
            }
        }

        return result;



        
    }
}
