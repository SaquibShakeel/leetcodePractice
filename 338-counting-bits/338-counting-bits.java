class Solution {
    public int[] countBits(int n) {
        int[] bewb = new int[n+1];
        for(int i = 1; i < bewb.length; i++){
            bewb[i] = lamda(i);
        }
        return bewb;
    }
    
    int lamda(int num){
        int ans=0;
        while(num>0){
            ans += num&1;
            num = num>>1;
        }
        return ans;
    }
    
}