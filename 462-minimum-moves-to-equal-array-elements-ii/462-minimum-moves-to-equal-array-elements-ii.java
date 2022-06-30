class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int m = n/2;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans += Math.abs(nums[i] - nums[m]);
        }
        return ans;
    }
}