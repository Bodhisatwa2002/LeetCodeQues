class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r = image.length;
        int c = image[0].length;
        for(int i=0; i<r; i++){
            for(int j =0; j<(c+1)/2; j++){
                int temp = image[i][j];
                image[i][j] = image[i][c-j-1] ^1;
                image[i][c-j-1] = temp ^1;
            }
        }
        return image;
    }
}