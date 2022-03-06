class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int low = 0;
        int high = nums.length-1;
        int i = high;
        while(low <= high){
            if(Math.abs(nums[low]) > Math.abs(nums[high])){
                ans[i] = nums[low]*nums[low];
                low++;
                i--;
            }else{
                ans[i] = nums[high]*nums[high];
                high--;
                i--;
            }
        }
        return ans;
    }
}