class Solution {
    public int splitArray(int[] nums, int m) {
        int s = 0;
        int e = 0;
        for(int i=0;i<nums.length;i++){
            s = Math.max(s, nums[i]);
            e += nums[i];
        }
        while(s<e){
            int mid = s + (e-s)/2;
            int count = 1;
            int sum = 0;
            for(int n:nums){
                if(sum+n>mid){
                    sum=n;
                    count++;
                }
                else {
                    sum+= n;
                }
            }
            if(count<=m){
                e=mid;
            }
            else {
                s=mid+1;
            }
        }
        return e;
    }
}