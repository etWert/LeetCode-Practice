class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int prefixSum=0;
        for(int g:gain){
            prefixSum+=g;
            max=Math.max(max,prefixSum);
        }
        return max;
    }
}