class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            // אם זה אות ניקוד
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1) {
                vowels.add(s.charAt(i));
            }
        }
        int place = vowels.size() - 1;
        for (int i = 0; i < s.length(); i++) {
            if ("aeiouAEIOU".indexOf(s.charAt(i)) != -1) {
                s = s.substring(0, i) + "" + vowels.get(place) + "" + s.substring(i + 1);
                place--;
            }
        }
        return s;
    }
}
// יש אפשרות לעשות זמן ריצה נמוך יותר