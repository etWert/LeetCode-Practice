class Solution {
    public boolean isSubsequence(String s, String t) {
        int len=0;
        for(int i=0,k=0;i<s.length()&&k<t.length();){
            if(s.charAt(i)==t.charAt(k)){
                i++;k++;
                len++;
            }
            else{
                k++;
            }
        }
        if(len==s.length())
        return true;
        return false;
    }

}