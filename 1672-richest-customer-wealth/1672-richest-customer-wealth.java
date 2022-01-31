class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth=0;
        for(int i=0; i<accounts.length; i++){
            if(arrSum(accounts[i])>wealth)wealth=arrSum(accounts[i]);
        }
        return wealth;
    }
    int arrSum(int[] arr){
	    int sum=0;
	    for(int a:arr){
	        sum+=a;
	    }
	    return sum;
	}
}