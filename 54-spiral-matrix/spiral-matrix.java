class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> print = new ArrayList<>();
        if(m == 0 || n==0){
            return print;
        }
        int left = 0;
        int right=n-1;
        int top =0;
        int bottom = m-1;
        while(top<=bottom && left<=right){
            for(int col=left;col<=right;col++){
                print.add(matrix[top][col]);
            }
            top++;
            for(int row=top;row<=bottom;row++){
                print.add(matrix[row][right]);
            }
            right--;
            if(top<=bottom){
                for(int col=right;col>=left;col--){
                    print.add(matrix[bottom][col]);
                }
                bottom--;
            }
            if(left<=right){
                for(int row=bottom;row>=top;row--){
                    print.add(matrix[row][left]);
                }
                left++;
            }
        }
        return print;
        
    }
}