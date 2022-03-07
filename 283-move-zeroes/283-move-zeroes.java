class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int count=0;
        while(count < nums.length) {
            count++;
            if(nums[i] == 0) {
                moveToEnd(nums, i);
            }
            else{
                i++;
            }
        }
    }
    
    void moveToEnd(int[] arr, int m) {
        while(m < arr.length-1) {
            arr[m] = arr[m+1];
            m++;
        }
        arr[m] = 0;
    }
    
}