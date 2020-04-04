package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {

    public static void main(String[] args){
        int[][] intervals = new int[][]{
                {4,10},
                {5,5},
                {5,6},
                {5,9},
                {5,8}
        };

        new MergeIntervals().merge(intervals);
    }

    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length ==0 || intervals[0].length == 0){
            return intervals;
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] != o2[0]){
                    return o1[0] - o2[0];
                }
                else {
                    return o1[1] - o2[1];
                }
            }
        });

        int flag = 0;

        for(int i = 0; i < intervals.length; i++){
            if(intervals[flag][1] >= intervals[i][0]){
                intervals[flag][1] = intervals[flag][1] > intervals[i][1]?intervals[flag][1]:intervals[i][1];
            }
            else {
                flag++;
                intervals[flag][0] = intervals[i][0];
                intervals[flag][1] = intervals[i][1];
            }
        }

        int[][] array = new int[flag+1][2];
        System.arraycopy(intervals,0,array,0,flag+1);

//        for(int i = 0; i < array.length; i++){
//            for(int j = 0; j <2; j++){
//                System.out.print(array[i][j]+" ");
//            }
//            System.out.println();
//        }
        return array;
    }
}
