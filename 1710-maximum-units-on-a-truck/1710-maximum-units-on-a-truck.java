class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        // int n = boxTypes.length;
        // int i = 0;
        // int j = 1;
        // while(i < n-1) {
        //     if(boxTypes[i][1] >= boxTypes[j][1]) {
        //         j++;
        //     }else {
        //         swap(boxTypes, i, j);
        //         j++;
        //     }
        //     if(j >= n) {
        //         i++;
        //         j = i+1;
        //     }
        // }
        // int ans = 0;
        // int box = 0;
        // i = 0;
        // while (i < n && box <= truckSize) {
        //     if(boxTypes[i][0] <= truckSize - box) {
        //         ans += boxTypes[i][0] * boxTypes[i][1];
        //         box += boxTypes[i][0];
        //     }else{
        //         ans += (truckSize - box) * boxTypes[i][1];
        //         box += truckSize - box;
        //     }
        //     i++;
        // }
        // return ans;
        
        Arrays.sort(boxTypes, Comparator.comparingInt(o -> -o[1]));
		int ans = 0, i = 0, n = boxTypes.length;
		while (i < n && truckSize > 0) {
			int maxi = Math.min(boxTypes[i][0], truckSize);
			ans += maxi * boxTypes[i][1];
			i++;
			truckSize -= maxi;
		}
		return ans;
    }
    
//     void swap(int[][] arr, int f, int s) {
//         int[] temp = arr[f];
//         arr[f] = arr[s];
//         arr[s] = temp;
//     }
    
}