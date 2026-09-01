class Solution {
    public int getLucky(String s, int k) {
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            res += (s.charAt(i) - 'a' + 1);
        }
        
        while (k-- > 0) {
            int sum = 0;
            for (int i = 0; i < res.length(); i++) {
                sum += res.charAt(i) - '0';
            }
            res = String.valueOf(sum);
        }
        return Integer.parseInt(res);
    }
}