class Solution {
    public int majorityElement(int[] nums) {
        int check = -469;
        for(int i=0; i<(nums.length+1)/2; i++){
            if(nums[i] != check && quantity(nums, nums[i])){
                check = nums[i];
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