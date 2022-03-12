class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int current = image[sr][sc];
        if(current != newColor){
            fillColor(image,sr,sc,current, newColor) ;
        }  
        return image;
    }
    public void fillColor(int[][] image, int r, int c, int color, int newColor){
        if(image[r][c] == color){
            image[r][c] = newColor;
        if(r >= 1) fillColor(image,r-1,c,color, newColor);
        if(c >= 1) fillColor(image,r,c-1,color, newColor);
        if(r+1 < image.length) fillColor(image,r+1,c,color, newColor);
        if(c+1 < image[0].length) fillColor(image,r,c+1,color, newColor);
        }
    }
}