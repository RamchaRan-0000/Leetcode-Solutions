class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> h  = new HashSet<>();
        for(int num:nums){
            h.add(num);
        }     
        for(int i=1; ;i++){
            int a = k*i;
            if(!h.contains(a)){
                return a;
            }
        } 
    }
}