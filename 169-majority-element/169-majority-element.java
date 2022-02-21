class Solution {
    public int majorityElement(int[] nums) {
        if(quantity(nums, nums[0]))return nums[0];
        for(int i=1; i<(nums.length+1)/2; i++){
            if(nums[i] != nums[i-1] && quantity(nums, nums[i])){
                return nums[i];
            }
        }
        return -1;
    }
    
    boolean quantity(int[] arr, int n){
        int ans = 0;
        for(int e : arr){
            if(e==n)ans++;
        }
        if(ans > arr.length/2)return true;
        return false;
    }
    
}