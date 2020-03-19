package easy;

import java.util.HashMap;
import java.util.Map;

public class T1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int other = target-nums[i];
            if(map.containsKey(other) && map.get(other)!= i){
                return new int[] {i,map.get(other)};
            }else {
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
