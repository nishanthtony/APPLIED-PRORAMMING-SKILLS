import java.util.*;

class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {


        int left_val, right_val, left_sum=0, i, n=nums.length;

        int[] result = new int[n];

        int total_sum=0;

        for(i=0; i<n ; i++)
        {
            total_sum+=nums[i];
        }

        for(i=0; i<n; i++)
        {
            left_val = (nums[i]*i)-left_sum;
            right_val = (total_sum-left_sum-nums[i]*(n-i));

            left_sum+=nums[i];

            result[i]=left_val+right_val;
        }

        return result;

    }
}
