class Solution {
    public int reverse(int x) {
        int a = Math.abs(x);
        long sum=0;
        int m=(int)(Math.log10(a));
        while(a>0){
            sum+=(a%10)*Math.pow(10,m);
            a=a/10;
            m--;
        }
        if(sum>=-2147483648 && sum <= 2147483647){
            if(x<0)return (int)sum*(-1);
            return (int)sum;
        }
        return 0;
    }
}