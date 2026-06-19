class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (!set.contains(ch)) {
                    set.add(ch);
                    max = Math.max(max, set.size());
                } else {
                    break;
                }
            }
        }

        return max;
    }
}