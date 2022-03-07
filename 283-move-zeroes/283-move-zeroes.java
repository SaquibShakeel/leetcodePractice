class Solution {
    public void moveZeroes(int[] nums) {
        int first=0;
        int count=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                count++;
            }
            else{
                nums[first++] = nums[i];
            }
        }
        for(int j=1; j<=count; j++) {
            nums[nums.length - j] = 0;
        }
    }
}