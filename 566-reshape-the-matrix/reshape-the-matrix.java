class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c != mat.length*mat[0].length){
            return mat;
        }
        int [][] result = new int[r][c];
        for(int i=0;i<r*c; i++){
            result[i/c][i%c] = mat[i/mat[0].length][i%mat[0].length];
        }
        return result;
    }
}