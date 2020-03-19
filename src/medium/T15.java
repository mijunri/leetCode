package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T15 {
    public static void main(String[] args){
        int[] l = new int[]{0,-4,-1,-4,2,-3,-2};
        new T15().threeSum(l);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums == null || nums.length<3){
            return lists;
        }
        Arrays.sort(nums);

        for(int i = 0; i < nums.length ; i++){
            int val = nums[i];
            if(i>0 && val == nums[i-1]){
                continue;
            }
            int low = i+1;
            int high = nums.length-1;
            while (low < high){
                if(val + nums[low] + nums[high] == 0){
                    List<Integer> list = Arrays.asList(val,nums[low],nums[high]);
                    lists.add(list);
                    while(true){
                        low++;
                        if(low>=high||nums[low] != nums[low-1]){
                            break;
                        }
                    }
                    continue;
                }else if(val + nums[low] + nums[high] > 0){
                    high--;
                }else {
                    low++;
                }
            }
        }
        return lists;
    }
}
