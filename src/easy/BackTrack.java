package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackTrack {
    private List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums){
        List<Integer> list = new ArrayList<>();
        backTrack(list,nums);
        return lists;
    }

    private void backTrack(List<Integer> track, int[] nums){
        if(track.size() == nums.length){
            lists.add(new ArrayList<>(track));
        }

        for(int i = 0; i < nums.length ; i++){
            if(track.contains(nums[i])){
                continue;
            }
            track.add(nums[i]);
            backTrack(track,nums);
            track.remove(track.size()-1);
        }
    }
}
