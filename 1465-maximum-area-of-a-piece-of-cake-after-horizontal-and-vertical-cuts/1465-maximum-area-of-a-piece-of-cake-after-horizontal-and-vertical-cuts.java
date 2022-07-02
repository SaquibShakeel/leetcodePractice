class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int m = horizontalCuts.length;
        int n = verticalCuts.length;
        long l = (long)(h - horizontalCuts[m-1]);
        long b = (long)(w - verticalCuts[n-1]);
        int x = 0;
        int y = 0;
        long mod = 1000000007;
        int i = 0, j = 0;
        while(true) {
            if(i < m) {
                if(horizontalCuts[i] - x > l) {
                    l = horizontalCuts[i] - x;
                }
                x = horizontalCuts[i];
                i++;
            }
            if(j < n) {
                if(verticalCuts[j] - y > b) {
                    b = verticalCuts[j] - y;
                }
                y = verticalCuts[j];
                j++;
            }
            if(i >= m && j >= n)break;
        }
        return (int)((l*b)%mod);
        
    }
}