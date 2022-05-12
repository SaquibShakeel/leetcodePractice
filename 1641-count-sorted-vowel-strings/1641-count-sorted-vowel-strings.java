class Solution {
    public int countVowelStrings(int n) {
        if(n==1)return 5;
        return ans(n-1, 5);
	}
    int ans(int n, int a){
        if(a < 1)return 0;
        if(n==1){
            switch(a){
                case 5:
                    return 15;
                case 4:
                    return 10;
                case 3:
                    return 6;
                case 2:
                    return 3;
                case 1:
                    return 1;
            }
        }
        return (ans(n-1, a) + ans(n-1, a-1) + ans(n-1, a-2) + ans(n-1, a-3) + ans(n-1, a-4));
    }
}