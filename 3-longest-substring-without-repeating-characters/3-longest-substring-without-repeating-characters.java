class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] charSet = s.toCharArray();
        int n = charSet.length;
        if (n == 0) return 0; 
        int length = 1;
        int longest = 1; 
        int left = 0; 
        int tmp = 0;
        for (int right = 1; right < n; right++) {
            tmp = charEqualsToCharAtThisIndex(charSet[right], charSet, left, right); 
			if (tmp == -1) {
                length++;
                longest = longest > length ? longest : length;
            } else {
                length = right - tmp;
                left = tmp + 1;
            }
        }
        return longest;
    }
    
    private int charEqualsToCharAtThisIndex(char c, char[] seq, int firstIndex, int lastIndex) {
        for (int i = firstIndex; i < lastIndex; i++) {
            if (c == seq[i]) 
                return i;
        }
        return -1;
    }
}