class Solution {
    public int addDigits(int num) {
        // while(Math.log10(num)>=1){
        //     num = add(num);
        // }
        // return num;
        return num - 9*((num-1)/9);
    }
    
//     int add(int n){
//         int ans = 0;
//         while(n > 0){
//             ans += n%10;
//             n = n/10;
//         }
//         return ans;
//     }
    
}