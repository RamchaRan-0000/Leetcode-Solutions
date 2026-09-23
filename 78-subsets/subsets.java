class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> subsets = new ArrayList<>();
        for(int num =0;num<(1<<n);num++){
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<n;i++){
                if((num & (1<<i)) !=0) {
                    l.add(nums[i]);
                }

            }
            subsets.add(l);
        }
        return subsets;
        
    }
}