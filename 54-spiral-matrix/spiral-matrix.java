class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();

        if(matrix.length== 0){
            return ans;
        }

        int left =0;
        int right = matrix[0].length - 1;
        int top =0;
        int bottom = matrix.length - 1;
        
        while(left <= right && top <= bottom ){
            // we will move from left to right 
            for (int i = left; i<= right ; i++){
                ans.add(matrix[top][i]);
            }
            top++;

            // we will move from top to bottom
            for (int i = top; i<= bottom ; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){

            // we will move from right to left
                for (int i = right; i>= left ; i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){
            //we will move from bottom to top
                for (int i = bottom; i>= top ; i--){
                    ans.add(matrix[i][left]);
                }
                left++; 
            }    
        }
        return ans;
    }
}