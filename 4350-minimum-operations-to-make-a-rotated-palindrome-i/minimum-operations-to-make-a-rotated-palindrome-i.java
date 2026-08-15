class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int minCost = Integer.MAX_VALUE; ;
        for(int r=0;r<n;r++){
            int cost = r;
            for(int i=0;i<n/2;i++){
                char left = s.charAt((i+r)%n);
                char right = s.charAt((n-1-i+r)%n);
                int x = left-'a';
                int y = right-'a';
                int a = (y-x+26)%26;
                int b = (x-y+26)%26;
                cost += Math.min(a,b);
            }  
            minCost = Math.min(minCost,cost);
        }   
        return minCost;
        
    }
}