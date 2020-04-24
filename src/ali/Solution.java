package ali;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> lists = new ArrayList<>();

    public static void main(String[] args){
        List<List<Integer>> lists = new Solution().divide(7,8);
        for(int i = 0; i < lists.size(); i++){
            List<Integer> list = lists.get(i);
            for(int j = 0; j < list.size();j++){
                System.out.print(list.get(j)+" ");
            }
            System.out.println();
        }

    }

    public List<List<Integer>> divide(int n, int m){
        backTrace(new ArrayList<>(),n,m);
        return lists;
    }

    public void backTrace(List<Integer> list, int n, int m){
        if(m == 0){
            lists.add(new ArrayList<Integer>(list));
        }
        else if(m == 1 && list.get(list.size()-1) <= n){
            list.add(n);
            backTrace(list,0,0);
            list.remove(list.size()-1);
        }
        else {
            int start = 0;
            if (!list.isEmpty()){
                start = list.get(list.size()-1);
            }
            for(int i = start; i <= n; i++){
                list.add(i);
                backTrace(list,n-i,m-1);
                list.remove(list.size()-1);
            }
        }
    }
}
