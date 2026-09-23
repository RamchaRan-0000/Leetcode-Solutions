class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == divisor){
            return 1;
        }
        boolean sign = true;
        if(dividend>=0 && divisor <0) sign = false;
        else if(divisor>=0 && dividend <0) sign = false;
        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        long ans = 0;
        while(n>=d){
            int cnt = 0;
            while(n>=(d<<(cnt+1))){  // d<<cnt+1 = d * 2^(cnt+1);
                cnt += 1;
            }
            ans += (1L<<(cnt));
            n -= (d<<(cnt));
        }
        if(ans > Integer.MAX_VALUE && sign == true) return Integer.MAX_VALUE;
        else if (ans>(long)Integer.MAX_VALUE+1 && sign == false) return Integer.MIN_VALUE;
        return sign?(int)ans:-(int)ans;
        
    }
}