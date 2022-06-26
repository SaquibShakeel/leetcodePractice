class Solution {
    public int maxScore(int[] cardPoints, int k) {
        // return helper(cardPoints, k, 0, 0, cardPoints.length-1);
        int n = cardPoints.length, totalSum = 0, minSubarray = 0;

	    for (int i=0, currSum=0; i<n; i++) {
		    totalSum += cardPoints[i];
		    currSum += cardPoints[i];
		    if (i < n-k) minSubarray += cardPoints[i];
		    else {
			    currSum -= cardPoints[i-(n-k)];
			    minSubarray = Math.min(minSubarray, currSum);
		    }
	    }
    
	    return totalSum - minSubarray;
    }
    
    // int helper(int[] arr, int k, int sum, int i, int j) {
    //     if(k <= 0)return sum;
    //     return Math.max(helper(arr, k-1, sum + arr[i], i+1, j), helper(arr, k-1, sum + arr[j], i, j-1));
    // }
    
}