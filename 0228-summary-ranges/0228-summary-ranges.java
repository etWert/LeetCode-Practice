class Solution {
public static List<String> summaryRanges(int[] nums) {
        List<String> s = new ArrayList<String>();
        int a,b;
        for(int i=0;i<nums.length;i++){
            a=nums[i];
            while(i<nums.length-1&&nums[i]==nums[i+1]-1){
                i++;
            }
            b=nums[i];
            s.add(a==b?Integer.toString(a):Integer.toString(a)+"->"+Integer.toString(b));
        }
        return s;
    }
}