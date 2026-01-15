class Solution {
    public int maxDifference(String s) {

        HashMap<Character, Integer> dic = new HashMap<>();

        for (char ch : s.toCharArray()) {
            dic.put(ch, dic.getOrDefault(ch, 0) + 1);
        }

        int max_odd = 0;
        int min_even = Integer.MAX_VALUE;

        for (int num : dic.values()) {
            if (num % 2 == 1) {
                max_odd = Math.max(max_odd, num);
            } else {
                min_even = Math.min(min_even, num);
            }
        }

        return max_odd - min_even;
    }
}
