package array.subarray;

import java.util.HashMap;
import java.util.Map;

/*Given an array nums and a target value k, find the maximum length of a subarray that sums to k. If there isn't one, return 0 instead.

Note:
The sum of the entire nums array is guaranteed to fit within the 32-bit signed integer range.

Example 1:

Input: nums = [1, -1, 5, -2, 3], k = 3
Output: 4 
Explanation: The subarray [1, -1, 5, -2] sums to 3 and is the longest.
Example 2:

Input: nums = [-2, -1, 2, 1], k = 1
Output: 2 
Explanation: The subarray [-1, 2] sums to 1 and is the longest.
Follow Up:
Can you do it in O(n) time?*/

public class MaximumSizeSubarraySumEqualsk_325 {

	public int maxSubArrayLen(int[] nums, int k) {

		Map<Integer, Integer> hashmap = new HashMap();
		hashmap.put(0, -1); // sum -> index
		int sum = 0;
		int res = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			int diff = sum - k;
			if (hashmap.containsKey(diff)) {
				int index = hashmap.get(diff);
				res = Math.max(res, i - index);
			}
			if (!hashmap.containsKey(sum)) {
				hashmap.put(sum, i);
			}
		}
		return res == Integer.MIN_VALUE ? 0 : res;
	}

}
