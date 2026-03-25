class Solution {
    public int countGoodNumbers(long n) {
        long mod = 1000000007;
        long odd = (n + 1) / 2;  
        long even = n / 2;        
        long res = (power(5, odd, mod) * power(4, even, mod)) % mod;
        return (int) res;
    }
    
    public long power(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }
}