class Solution {
    public int majorityElement(int[] nums) {
        if(quantity(nums, nums[0]) > nums.length/2)return nums[0];
        for(int i=1; i<(nums.length+1)/2; i++){
            if(nums[i] != nums[i-1] && quantity(nums, nums[i]) > nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
    
    int quantity(int[] arr, int n){
        int ans = 0;
        for(int e : arr){
            if(e==n)ans++;
        }
        return ans;
    }
    
}