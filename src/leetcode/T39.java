package leetcode;

import java.util.LinkedList;
import java.util.List;

public class T39 {
    private List<List<Integer>> lists = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new LinkedList<>();
        backTrack(list,candidates,target,0);
        return lists;
    }

    private void backTrack(List<Integer> track, int[] nums, int target, int start){
        int amount = 0;
        for(int v:track){
            amount+=v;
        }
        if(amount > target){
            return;
        }
        if(amount == target){
            lists.add(new LinkedList<>(track));
            return;
        }
        for(int i = start; i< nums.length; i++){
            track.add(nums[i]);
            backTrack(track,nums,target,start);
            track.remove(track.size()-1);
        }
    }
}
