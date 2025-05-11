class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix[]=new int[nums.length];
        int answer[]=new int[nums.length];
        int prod=1;//i שומר את המכפלות של כל האיברים שלפני האיבר במקום
        int suffix=1;
        for(int i=0;i<nums.length;i++){
            prefix[i]=prod;
            prod*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            answer[i]=prefix[i]*suffix;
            suffix*=nums[i];
        }
        return answer;
    }
}