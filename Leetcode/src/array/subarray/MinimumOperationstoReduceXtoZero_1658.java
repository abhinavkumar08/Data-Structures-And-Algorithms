package array.subarray;

public class MinimumOperationstoReduceXtoZero_1658 {
	
	public int minOperations(int[] nums, int x) {
        
	       int sumAll =0;
	        for(int num : nums)
	            sumAll += num;
	        
	        int k = sumAll - x;
	        int j=0, i=0;
	        int sum = 0, res = -1;
	        
	        while(j < nums.length){
	            sum += nums[j];
	            while(i<=j && sum > k){
	                sum -= nums[i];
	                i++;
	            }
	            if(sum==k)res = Math.max(res, j-i+1);
	            j++;
	        }
	        return res==-1?-1: nums.length-res;
	    }

}
