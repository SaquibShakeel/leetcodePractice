class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int check = 0;
        if(flowerbed.length>=3){
            if(flowerbed[0]==0 && flowerbed[1]==0){
                check++;
                flowerbed[0]=1;
            }
            for(int i=1; i<flowerbed.length-1;i++){
                if(flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i]!=1){
                    check++;
                    flowerbed[i]=1;
                }
            }
            if(flowerbed[flowerbed.length-2]==0 && flowerbed[flowerbed.length-1]==0){
                check++;
                flowerbed[flowerbed.length-1]=1;
            }
        }
        else if(flowerbed[0]==0 && n==1)check++;
        return check>=n;
    }
}