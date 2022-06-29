class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        return helper(s, n, n);
    }
    
    String helper(String s, int l, int n) {
        if(n == 1) return s.substring(0, 1);
        for(int i = 0; i <= l - n; i++) {
            String ans = s.substring(i, n+i);
            if(isPalindrome(ans)) return ans;
        }
        return helper(s, l, n-1);
    }
    
    boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i <= j) {
            if(s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
    
}