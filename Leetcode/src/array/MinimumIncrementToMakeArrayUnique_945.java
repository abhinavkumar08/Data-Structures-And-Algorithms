package array;

import java.util.Arrays;

//Input: [3,2,1,2,1,7]
//Output: 6
//Explanation:  After 6 moves, the array could be [3, 4, 1, 2, 5, 7].
//It can be shown with 5 or less moves that it is impossible for the array to have all unique values.
public class MinimumIncrementToMakeArrayUnique_945 {

	//Sort the array, check prev and curr element, 
	//if prev is greater than or equal to curr that implies there has been a duplicate or
	// prev is updated to a bigger value during iteration
	// curr element will be prev +1 to make unique
	public int minIncrementForUnique(int[] arr) {

		Arrays.sort(arr);
		int res = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] >= arr[i]) {
				res += arr[i - 1] - arr[i] + 1;
				arr[i] = arr[i - 1] + 1;
			}
		}
		return res;
	}
}
