class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] tmpArr = new int[m + n];
		int i = 0, j = 0, k = 0;
		if (n == 0)
			return;
		//כל עוד יש בין מה להשוות
		while (i != m&&j!=n) {
			if (nums1[i] <= nums2[j])
				tmpArr[k++] = nums1[i++];
			else
				tmpArr[k++] = nums2[j++];
		}
		//המערך השני הגיע לסופו-נעביר את כל האיברים הנותרים מהמערך הראשון
		while (i != m) {
			tmpArr[k++] = nums1[i++];
		}
		//המערך הראשון הגיע לסופו-נעביר את כל האיברים הנותרים מהמערך השני
		while (j != n) {
			tmpArr[k++] = nums2[j++];
		}
		//nums1 נעתיק את כל האיברים לאחר הממיזוג בחזרה למערך		
		for (k = 0; k < tmpArr.length; k++)
			nums1[k] = tmpArr[k];

    }
}