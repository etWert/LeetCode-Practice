class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first=nums[0],second=0;
        boolean secondDefined = false;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=first)
            first=nums[i];
            else if(!secondDefined||nums[i]<=second){
                second=nums[i];
                secondDefined=true;
            }
            else{
                return true;
            }
        }
    return false;
    }
}