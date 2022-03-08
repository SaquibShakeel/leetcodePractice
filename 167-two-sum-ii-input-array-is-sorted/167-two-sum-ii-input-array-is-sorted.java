class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        while(numbers[i] <= Math.abs(target)) {
            if((i==0 || numbers[i] != numbers[i-1]) && search(numbers, target-numbers[i], i) != -1) {
                return new int[]{i+1, search(numbers, target-numbers[i], i)+1};
            }
            i++;
        }
        return new int[]{-1,-1};
    }
    
    int search(int[] arr, int t, int i) {
        int s = 0;
        int e = arr.length-1;
        while(s<=e) {
            int m = s + (e - s)/2;
            if(arr[m] == t){
                if(m==i){
                    if(arr[m+1] == t)return m+1;
                    else if(arr[m-1] == t)return m-1;
                    else return -1;
                }
                return m;
            }
            else if(arr[m] > t)e = m - 1;
            else s = m + 1;
        }
        return -1;
    }
    
}