class Solution {
    public int removeDuplicates(int[] nums) {
        int currInd = 0;
        int currElement = nums[0];
        for(int i=1 ; i<nums.length ; i++){
        
            if(nums[currInd] != nums[i] ){
                currInd ++;
			
                if(currInd != i)                
                    nums[currInd] = nums[i];
            }
            
        }
        
        return currInd + 1;
    }
    
}