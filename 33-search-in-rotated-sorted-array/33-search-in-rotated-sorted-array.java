class Solution {
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot == -1)return search(nums, 0, nums.length-1, target);
        if(nums[pivot]==target)return pivot;
        if(nums[0]<=target)return search(nums, 0, pivot-1, target);
        return search(nums, pivot+1, nums.length-1, target);
    }
    
    int findPivot(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(m<e && arr[m]>arr[m+1])return m;
            if(m>s && arr[m]<arr[m-1])return m-1;
            if(arr[s]>=arr[m]){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return -1;
    }
    
    int search(int[] arr, int s, int e, int t){
        while(s<=e){
            int m = s + (e - s)/2;
            if(arr[m]<t)s= m+1;
            else if(arr[m]>t)e=m-1;
            else return m;
        }
        return -1;
    }
    
}