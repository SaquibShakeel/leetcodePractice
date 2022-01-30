class Solution {
    public void rotate(int[] nums, int k) {
        if(k>=nums.length)k=k-nums.length;
        if(nums.length==2 && k>0){
            reverse(nums, 0, 1);
        }
        if(nums.length>2 && k>0){
            reverse(nums, 0, nums.length-1);
            reverse(nums, 0, k-1);
            reverse(nums, k, nums.length-1);
        }
    }
    
    void reverse(int[] arr, int s, int e){
        while(s<e){
            int temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }
    }
    
}