import java.util.*;
class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0; // important edge case
        
        int count = 0;

        if (k == 0) {
            HashMap<Integer, Integer> map = new HashMap<>();
            
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            
            for (int freq : map.values()) {
                if (freq > 1) count++;
            }
            
        } else {
            HashSet<Integer> set = new HashSet<>();
            
            for (int num : nums) {
                set.add(num);
            }
            
            for (int num : set) {
                if (set.contains(num + k)) {
                    count++;
                }
            }
        }

        return count;
    }
}