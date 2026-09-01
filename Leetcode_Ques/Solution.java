class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for (int base = 2; base <= n - 2; base++) {
            if (!isPalindrome(convert(n, base))) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> convert(int num, int base) {
        List<Integer> digits = new ArrayList<>();

        while (num != 0) {
            digits.add(num % base);
            num /= base;
        }

        return digits;
    }

    public boolean isPalindrome(List<Integer> digits) {
        int left = 0;
        int right = digits.size() - 1;

        while (left < right) {
            if (!digits.get(left).equals(digits.get(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}