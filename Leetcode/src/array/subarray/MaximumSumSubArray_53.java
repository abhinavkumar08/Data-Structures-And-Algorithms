package array.subarray;

public class MaximumSumSubArray_53 {
	
	
	 public int maxSubArrayKadane(int[] nums) {
	        
	        int sumSoFar = 0;
	        int maxSum = Integer.MIN_VALUE;
	        int start=0; int end=0;
	        
	        for(int i=0; i<nums.length; i++){
	            sumSoFar += nums[i];
	            
	            if(sumSoFar<0){
	                start = i+1;
	                sumSoFar = 0;
	            }
	            
	            if(sumSoFar > maxSum){
	                maxSum = sumSoFar;
	                end = i;
	            }
	        }
	        
	        System.out.println("i "+start);
	        System.out.println("j "+end);
	        return maxSum;
	        
	   }
	 
	 
	 public int maxSubArray(int[] nums) {
	        
	       int sumSoFar = 0;
	        int maxSum = Integer.MIN_VALUE;
	        
	        for(int i=0; i<nums.length; i++){
	            sumSoFar =  Math.max(nums[i], nums[i]+sumSoFar);
	            maxSum = Math.max(maxSum, sumSoFar);
	        }
	        
	        return maxSum;
	    }

}
