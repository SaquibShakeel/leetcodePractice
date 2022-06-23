class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length == 1)return nums[0];
        int[] n = new int[nums.length - 1];
        for(int i = 0; i < n.length; i++) {
            n[i] = (nums[i] + nums[i+1])%10;
        }
        return triangularSum(n);
    }
}