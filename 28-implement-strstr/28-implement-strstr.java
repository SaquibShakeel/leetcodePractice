class Solution {
    public int strStr(String haystack, String needle) {
        int ans = 0;
        for(int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)) {
                ans = helper(haystack, needle, i+1);
                if (ans != -1) return ans;
            }
        }
        return -1;
    }
    
    int helper(String a, String b, int i) {
        int ans = i-1;
        for(int j=1; j < b.length(); j++) {
            if(i >= a.length()) return -1;
            if(b.charAt(j) == a.charAt(i)){
                i++;
            }
            else{
                return -1;
            }
        }
        return ans;
    }
    
}