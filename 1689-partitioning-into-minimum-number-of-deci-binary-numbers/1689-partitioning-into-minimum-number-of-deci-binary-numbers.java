class Solution {
    public int minPartitions(String n) {
        int ans = Integer.MIN_VALUE;
        for(int i=0; i < n.length(); i++) {
            int num = n.charAt(i) - 48;
            ans = Math.max(num, ans);
        }
        return ans;
    }
}