class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        for(char c: tasks)
        {
            freq[c - 'A']++;
        }        

        int max_freq=0;

        for(int f : freq)
        {
            if(f>max_freq)
            {
                max_freq=f;
            }
        }

        int max_count = 0;

        for(int f : freq)
        {
            if( f == max_freq)
            {
                max_count++;
            }
        }

        int partcount = max_freq-1;
        int partLength=n+1;
        int minIntervals = partcount*partLength+max_count;

        return Math.max(tasks.length,minIntervals);


    }
}
