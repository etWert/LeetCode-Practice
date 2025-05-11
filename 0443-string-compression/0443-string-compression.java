class Solution {
    public int compress(char[] chars) {
        int place_to_insert=0,j=0,count=0;
        String len="";
        for(int i=0;i<chars.length;i=j){
            for(j=i;j<chars.length&&chars[i]==chars[j];j++);
            chars[place_to_insert++]=chars[i];
            count=j-i;
            if(count>1){
                len = Integer.toString(count);
                for(int k=0;k<len.length();k++){
                    chars[place_to_insert++]=len.charAt(k);
                }
            }
        }
        
        return place_to_insert;
    }
}