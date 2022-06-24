class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        return helper(n, dp);
    }
    
    int helper(int n, int[] dp){
        if(dp[n] != 0)return dp[n];
        if(n <= 1)return 1;
        int left = helper(n - 1, dp);
        int right = helper(n - 2, dp);
        return dp[n] = left + right;
    }
    
}