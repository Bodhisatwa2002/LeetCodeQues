class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        for(int i=0; i<indices.length; i++){
                //increment all cells on row
                   int row = indices[i][0]; 
                   for(int j=0; j<n; j++){
                       mat[row][j]++;
                   } 
                //increment all cells on column
                    int col = indices[i][1];
                    for(int j=0; j<m; j++){
                        mat[j][col]++;
                    }
        }
        int count =0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]%2 != 0)
                    count++;
            }
        }
        return count;
    }
}