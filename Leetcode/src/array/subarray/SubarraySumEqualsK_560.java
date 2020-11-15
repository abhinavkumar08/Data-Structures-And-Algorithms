package array.subarray;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK_560 {
	
public int subarraySum(int[] nums, int k) {
        
        Map<Integer, Integer> hashmap = new HashMap();
        hashmap.put(0,1);
        int sum=0;
        int count =0;
        
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int diff = sum - k;
            if(hashmap.containsKey(diff)){
                count += hashmap.get(diff);
            }
            hashmap.put(sum, hashmap.getOrDefault(sum,0)+1);
        }
        System.out.println(hashmap);
        
        return count;
        
    }

}
