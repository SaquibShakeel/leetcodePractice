class Solution {
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if(n <= 1)return n;
        if(n == 2) {
            if(nums[0] != nums[1])return 2;
            return 1;
        }
        int count=1;
 
 
        for(int i=1, j=0; i<n; j=i, i++){
            if(nums[j]<nums[i]){
                count++;
                while(i<n-1 && nums[i]<=nums[i+1]){
                    i++;
                }
            }else if(nums[j]>nums[i]){
                count++;
                while(i<n-1 && nums[i]>=nums[i+1]){
                    i++;
                }
            }
        }

        return count;
        
    }
}