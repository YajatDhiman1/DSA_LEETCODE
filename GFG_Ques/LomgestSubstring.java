package GFG_Ques;

import java.util.HashSet;

class Solution {
    public int longestUniqueSubstr(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            while (set.contains(ch)) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(ch);
            max = Math.max(max, set.size());
        }
        return max;
    }
}