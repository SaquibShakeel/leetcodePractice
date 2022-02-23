class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        int n = columnTitle.length() - 1;
        for(int i = n; i>=0; i--){
            sum += Math.pow(26, n-i) * val(columnTitle.charAt(i));
        }
        return sum ;
    }
    
    int val(char c){
        return c-64;
    }
    
}