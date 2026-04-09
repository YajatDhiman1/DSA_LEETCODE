import java.util.*;

class Solution {
    public int similarPairs(String[] words) {
        HashSet<Character> setone = new HashSet<>();
        HashSet<Character> settwo = new HashSet<>();
        int pairs = 0;
        for (int i = 0; i < words.length-1; i++) {
            int k = 0;
            while (k < words[i].length()) {
                char ch = words[i].charAt(k);
                setone.add(ch);
                k++;
            }
            for (int qaz = i + 1; qaz < words.length; qaz++) {
                int a = 0;
                while (a < words[qaz].length()) {
                    char chh = words[qaz].charAt(a);
                    settwo.add(chh);
                    a++;
                }
                if (setone.equals(settwo)) {
                    pairs++;
                }
                settwo.clear();
            }
            setone.clear();
        }
        return pairs;
    }
}