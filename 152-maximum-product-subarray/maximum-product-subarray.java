class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        long currentMax = nums[0];
        long currentMin = nums[0];
        long maxProduct = nums[0];
        for (int index = 1; index < n; index++) {
            long currentValue = nums[index];
            long previousMax = currentMax;
            long previousMin = currentMin;
            currentMax = Math.max(
                currentValue,
                Math.max(
                    previousMax * currentValue,
                    previousMin * currentValue
                )
            );
            currentMin = Math.min(
                currentValue,
                Math.min(
                    previousMax * currentValue,
                    previousMin * currentValue
                )
            );
            if (currentMax > maxProduct) {
                maxProduct = currentMax;
            }
        }
        return (int)maxProduct;
        
    }
}