package array.subarray;

public class MaximumProductSubarray_152 {
	
	//As we iterate, we keeping checking the maxProduct and minProduct so far
	//max product can be achieved by any 3 conditions :
	//1. the number itself is max and rest might be -ve
	//2. the product of minSoFar * currNum (two negatives)
	//3. the product of maxSoFar * currNum (two positives)
	 public int maxProduct(int[] nums) {
	        
	        if(nums.length==0) return 0; 
	        int max = nums[0];
	        int maxSoFar = nums[0];
	        int minSoFar = nums[0];
	        
	        for(int i=1; i<nums.length; i++){
	            
	            int temp = maxSoFar;
	            maxSoFar = Math.max(Math.max(nums[i], nums[i]*maxSoFar), nums[i]*minSoFar);
	            minSoFar = Math.min(Math.min(nums[i], temp*nums[i]), nums[i]*minSoFar);
	            
	            max = Math.max(max, maxSoFar);
	        }
	        return max;
	    }

}
