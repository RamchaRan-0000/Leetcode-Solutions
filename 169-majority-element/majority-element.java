class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            hm.put(val,hm.getOrDefault(val,0)+1);
        }
        int ans = 0;
        int n=nums.length/2;
        for(int macha:hm.keySet()){
            int value=hm.get(macha);
            if(value>n){
            ans=macha;
            break;
            }
        }
        return ans;

    }
}