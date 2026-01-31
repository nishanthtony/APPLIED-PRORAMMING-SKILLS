import java.util.HashMap;

class ContainsDuplicate{
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer,Integer> dict = new HashMap<>();

        for(int i=0 ; i<nums.length ; i++)
        {
            int num = nums[i];

            if (dict.containsKey(num)){
                if( i-dict.get(num) <= k){
                    return true;
                }
            }

            dict.put(num,i);
        }
        return false;
    }
}
