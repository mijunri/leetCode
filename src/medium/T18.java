package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T18 {


    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        if(nums == null || nums.length < 4){
            return lists;
        }

        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int key = target - nums[i];
            for(int j = i+1; j < nums.length; j++){
                int val = nums[j];
                if(j>i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                int low = j+1, high = nums.length-1;
                while(low < high){
                    if(val + nums[low] + nums[high] == key){
                        lists.add(Arrays.asList(nums[i],val,nums[low],nums[high]));
                        while(true){
                            low++;
                            if(low >= high || nums[low] != nums[low-1]){
                                break;
                            }
                        }
                        continue;
                    }else if(val + nums[low] + nums[high] > key){
                        high--;
                    }else {
                        low++;
                    }
                }
            }
        }
        return lists;
    }
}
