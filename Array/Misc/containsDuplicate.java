package Array.Misc;
import java.util.*;
public class containsDuplicate {
    
   public boolean containsDuplicateElement(int[] nums) {
// brute force
/*    Arrays.sort(nums);
    int n = nums.length;
    for(int i = 0; i < n-1; i++) {
        if(nums[i] == nums[i+1]) {
            return true;
        }
    }
    return false;
*/

// optimised approach
    int n = nums.length;
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for(int i = 0; i < n; i++) {
        hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);;
        if(hashMap.get(nums[i]) > 1) {
            return true;
        }
    }
    return false;
    }
}
