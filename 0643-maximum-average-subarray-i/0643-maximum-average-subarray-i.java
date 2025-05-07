class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max_sum=0,sum=0;
        for(int i=0;i<k;i++){
            max_sum+=nums[i];
      }
      sum=max_sum;
      for(int i=k;i<nums.length;i++){
        sum=sum-nums[i-k]+nums[i];
        if(sum>max_sum){
            max_sum=sum;
        }
      }
      return max_sum/k;
    }
}