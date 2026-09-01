import java.util.*;

class Solution {
    public int maximumLength(int[] nums) {

        HashMap<Long, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put((long) num, map.getOrDefault((long) num, 0) + 1);
        }

        int ans = 1;

        if (map.containsKey(1L)) {
            int cnt = map.get(1L);
            ans = Math.max(ans, (cnt % 2 == 0) ? cnt - 1 : cnt);
        }

        for (long start : map.keySet()) {
            if (start == 1)
                continue;

            long curr = start;
            int len = 0;
            while (true) {
                if (!map.containsKey(curr))
                    break;

                if (map.get(curr) == 1) {
                    len++;
                    break;
                }
                
                long next = curr * curr;

                if (!map.containsKey(next)) {
                    len++;
                    break;
                }

                len += 2;
                curr = next;
            }

            ans = Math.max(ans, len);
        }

        return ans;
    }
}