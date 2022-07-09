class Solution {
    
//     int[] dp;
//     int MIN = Integer.MIN_VALUE/2;
    
//     public int maxResult(int[] nums, int k) {
//         dp = new int[nums.length+1];
//         Arrays.fill(dp, MIN);
//         return helper(nums, nums.length, k, 0, dp);
//     }
    
//     int helper(int[] nums, int n, int k, int i, int[] dp) {
//         if(i == n-1) {
//             return nums[i];
//         }
//         if(dp[i] != MIN)return dp[i];
//         int score = MIN;
//         for(int j = i+1; j <= Math.min(n-1, i+k); j++) {
//             int temp = helper(nums, n, k, j, dp);
//             if(temp > score)score = temp;
//         }
//         return dp[i] = nums[i] + score;
//     }
    
    
    public int maxResult(int[] nums, int k) {
        if(nums.length == 1){
            return nums[0];
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> b[0]-a[0]);
        pq.add(new int[]{nums[nums.length-1], nums.length-1});
        

        for(int i = nums.length-2; i > 0; i--){

            while(pq.peek()[1] > i+k){
                pq.remove();
            }

            int nextMax = pq.peek()[0];
            pq.add(new int[]{nextMax+nums[i], i});
        }
        

        while(pq.peek()[1] > k){
            pq.remove();
        }

        return pq.peek()[0]+nums[0];
    }
    
}