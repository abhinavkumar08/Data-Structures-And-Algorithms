package array.subarray;

//Minimum size subarray length whose sum is greater than s
//Input: s = 7, nums = [2,3,1,2,4,3]
//Output: 2
//Explanation: the subarray [4,3] has the minimal length under the problem constraint.
public class MinimumSizeSubArraySum_209 {
	
	
	//Normal Sliding window problem with two pointers
	public int minSubArrayLen(int s, int[] nums) {
	    
        int res = Integer.MAX_VALUE;
        int left=0, right=0;
        int sumSoFar = 0;
        
        while(right<nums.length){
            sumSoFar += nums[right];
            
            while(left<=right && sumSoFar>=s){
                res = Math.min(res, right-left+1);
                sumSoFar -= nums[left++];
                
            }
            right++;
        }
        return res==Integer.MAX_VALUE?0:res;
    }

}
