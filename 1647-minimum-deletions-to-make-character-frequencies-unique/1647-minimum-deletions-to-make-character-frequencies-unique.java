class Solution {
    public int minDeletions(String s) {
        int[] alpha = new int[26];
        for(char ch : s.toCharArray()) {
            alpha[ch - 97]++;
        }
        Arrays.sort(alpha);
        int ans = 0;
        int i = 24;
        while(i >= 0 && alpha[i] > 0) {
            while(alpha[i] >= alpha[i+1] && alpha[i] != 0) {
                alpha[i]--;
                ans++;
            }
            i--;
        }
        return ans;
    }
}