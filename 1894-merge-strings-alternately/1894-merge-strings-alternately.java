class Solution {
    public String mergeAlternately(String word1, String word2) {
        String merged="";
        int i=0,j=0,len1=word1.length(),len2=word2.length();
        while(i<len1&&j<len2){
            merged+=word1.charAt(i++);
            merged+=word2.charAt(j++);
        }
        //its must be that one string at least was finished
        //if word1 not finished
        if(i<len1){
            merged+=word1.substring(i,word1.length());
        }
        //if word2 not finished
        if(j<len2){
            merged+=word2.substring(j,word2.length());
        }
        return merged;
    }
}