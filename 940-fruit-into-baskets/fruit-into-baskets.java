class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int l = 0;
        int r = 0;
        HashMap<Integer,Integer> h = new HashMap<>();
        int length = 0;
        int maxLength = 0;
        while(r<n){
            h.put(fruits[r],h.getOrDefault(fruits[r], 0) + 1);
            if(h.size()>2){ // use if for (optimal)//
               if(h.get(fruits[l]) == 1) {
                    h.remove(fruits[l]);
                }
                else{
                    h.put(fruits[l], h.get(fruits[l]) - 1);
                }
                l++;
            }
            //maxLength = Math.max(maxLength,r-l+1);//
            maxLength = Math.max(maxLength, r - l + 1);
            r++;     
        }
        return maxLength;
        
    }
}