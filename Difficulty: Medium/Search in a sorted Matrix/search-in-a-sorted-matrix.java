

class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int r = 0;
        int c = mat[0].length-1;
        while(r<mat.length && c>=0){
            int f = mat[r][c];
            if(f==x){
                return true;
            }
            else if(f>x){
                c--;
            }
            else{
                r++;
            }
        }
        return false;
    }
}
