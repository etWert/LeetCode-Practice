class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        // s = s.trim();
        // String[] words = s.split("\\s+");
        String reversed="";        
        for (int i = words.length - 1; i > 0; i--) {
            reversed+=words[i].concat(" ");
        }
        reversed+=words[0];
         return reversed.toString();
    }
}