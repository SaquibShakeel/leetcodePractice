class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int ans = max;
        int count = 1;
        int i = nums.length - 2;
        while(i >= 0 && count < 3){
            if(nums[i] != ans){
                ans = nums[i];
                count++;
            }
            i--;
        }
        if(count == 3){
            return ans;
        }
        return max;
    }
}