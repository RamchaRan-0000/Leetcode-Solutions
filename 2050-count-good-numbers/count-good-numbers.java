class Solution {
    static final long MOD  = 1_000_000_007; /* Also written as 1e9 + 7 */
    public int countGoodNumbers(long n) {
        long ans = 1;
        long even = (n+1)/2;
        long odd = n/2;
        ans = ans* power(4,odd);
        ans = ans * power(5,even) % MOD;
        return (int)ans;
        
    }
    public long power(long base,long exp){
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp /= 2;
        }
        return result;
    }
}