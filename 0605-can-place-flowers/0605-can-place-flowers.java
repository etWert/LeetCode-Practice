class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
            if(n==0){
                return true;
            }
        for(int i=0;i<flowerbed.length;i++){
            //arr with 1 place
            if(i==0&&flowerbed[i]==0&&i==flowerbed.length-1&&flowerbed[i]==0){
            flowerbed[i]=1;
            n--;   
            }
            //the first place in arr;
            if(i==0&&flowerbed[i]==0&&i+1<flowerbed.length&&flowerbed[i+1]==0){
                flowerbed[i]=1;
                n--;
            }
            //the last place in arr;
            else if(i==flowerbed.length-1&&i!=0&&flowerbed[i]==0&&flowerbed[i-1]==0){
                flowerbed[i]=1;
                n--;
            }
            //other places in arr;
            else if(flowerbed[i]==0&&i+1<flowerbed.length&&flowerbed[i+1]==0&&flowerbed[i-1]==0){
                flowerbed[i]=1;
                n--;
            }
            if(n==0)
                return true;
        }
        return false;
    }
}