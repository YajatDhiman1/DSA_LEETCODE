class Solution {
    public int maxFreqSum(String s) {

        HashMap<Character, Integer> vowel = new HashMap<>();
        HashMap<Character, Integer> consonant = new HashMap<>();

        // Count frequencies
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (isVowel(ch)) {
                vowel.put(ch, vowel.getOrDefault(ch, 0) + 1);
            } else {
                consonant.put(ch, consonant.getOrDefault(ch, 0) + 1);
            }
        }

        int maxVowel = 0;
        int maxConsonant = 0;

        for (char ch : vowel.keySet()) {
            maxVowel = Math.max(maxVowel, vowel.get(ch));
        }

        for (char ch : consonant.keySet()) {
            maxConsonant = Math.max(maxConsonant, consonant.get(ch));
        }

        return maxVowel + maxConsonant;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}