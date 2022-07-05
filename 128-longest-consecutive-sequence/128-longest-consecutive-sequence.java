class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 1)return 0;
        Arrays.sort(nums);
        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);
        int index = 0;
        for(int i = 1,j = 0; i < nums.length; i++, j++) {
            if(nums[i] == nums[j]){
                continue;
            }
            if(i >= nums.length)break;
            if(nums[i] - nums[j] == 1) {
                ans[index]++;
            }else{
                index++;
            }
        }
        Arrays.sort(ans);
        return ans[ans.length-1];
    }
}