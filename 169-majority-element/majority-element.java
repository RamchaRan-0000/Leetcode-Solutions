class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int el = 0;
        for(int val:nums){
            if(count ==0){
                count++;
                el = val;
            }
            else if(el == val){
                count++;
            }
            else{
                count--;
            }
        }
        return el;

    }
}