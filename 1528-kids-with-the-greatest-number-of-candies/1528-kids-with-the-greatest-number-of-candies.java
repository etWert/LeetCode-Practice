class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // פעם אחת אעבור לראות מה המקסימום ונשמור אותו
        // אחכ נעבור שוב וכל מקום נבדוק האם הוא ועוד המקסימום שיש לי להוסיף גדול יותר
        // מהמקסימום במערך ונכניס את התוצאה למערך המוחזר
        List<Boolean> list=new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++){
            max=candies[i]>max?candies[i]:max;
        }
        for(int i=0;i<candies.length;i++){
            list.add(candies[i]+extraCandies>=max?true:false);
        }
        return list;
    }
}