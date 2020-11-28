package array.subarray;

public class ShortestSubarrayToBeRemovedToMakeArraySorted_1574{
	
	 public int findLengthOfShortestSubarray(int[] arr) {
	        
	        int n = arr.length;
	        int i = 0;
	        int j = n-1;
	        
	        while(i<=n-2 && arr[i]<=arr[i+1])i++;
	        while(j>=1 && arr[j]>=arr[j-1])j--;
	        
	        if(i==n-1)return 0;
	        int res =  Math.min(n-i-1, j);
	        int start = 0;
	        int end = j;
	        
	        while(start<=i && end<n){
	            if(arr[start]<=arr[end]){
	                start++;
	                res = Math.min(res, end-start);
	            }else
	                end++;
	        }
	        return res;
	    }
}
