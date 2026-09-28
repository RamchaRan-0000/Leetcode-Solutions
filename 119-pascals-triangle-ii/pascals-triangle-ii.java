class Solution {
    public List<Integer> getRow(int rowIndex) {
        int r = rowIndex+1;
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<r;i++){
            ans.add((int)pascalTriangleI(r,i+1));
        }
        return ans;  
    }
    public long pascalTriangleI(int r, int c) {
        long res=1;
        for(int i=0;i<c-1;i++){
            res = res*(r-i-1);
            res /= i+1;
        }
        return res;

    }
}