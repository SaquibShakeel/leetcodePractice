class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)return s;
        String[] arr = new String[numRows];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = "";
        }
        int row = 0;
        int dir = -1;
        for(int i = 0; i < s.length(); i++) {
            if(i%(numRows-1) == 0) dir *= -1;
            arr[row] += s.charAt(i);
            row += dir;
        }
        String ans = "";
        for(String blah : arr) {
            ans += blah;
        }
        return ans;
    }
}