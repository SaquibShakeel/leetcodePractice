class Solution {
    public int findPairs(int[] nums, int k) {
        int ans=0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(i==0){
                if(search(nums, nums[i]+k, i))ans++;
            }
            else if(nums[i]!=nums[i-1]){
                if(search(nums, nums[i]+k, i))ans++;
            }
        }
        return ans;
    }
    
    // boolean search(int[] arr, int t, int skip){
    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i] == t && i!=skip)return true;
    //     }
    //     return false;
    // }
    
    boolean search(int[] arr, int t, int skip){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m = s + (e - s)/2;
            if(arr[m]==t && m!=skip)return true;
            else if(arr[m]>t)e=m-1;
            else s=m+1;
        }
        return false;
    }
    
}