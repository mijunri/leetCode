package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class T210课程表2 {

    public static void main(String[] args){
        int[][] pre = new int[][]{{2,1},{2,0}};
        int[] course = new T210课程表2().findOrder(3,pre);
        System.out.println();
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> lists = new ArrayList<>();
        int[] degree = new int[numCourses];
        for(int i = 0; i < numCourses; i++){
            lists.add(new LinkedList<>());
        }

        for(int[] entry: prerequisites){
            int value = entry[0];
            int from = entry[1];
            degree[value] += 1;
            lists.get(from).add(value);
        }

        int[] courses = new int[numCourses];
        int index = 0;
        while (index < numCourses){
            boolean flag = false;
            for(int i = 0; i < numCourses; i++){
                if(degree[i] == 0){
                    courses[index++] = i;
                    degree[i] = -1;
                    List<Integer> list = lists.get(i);
                    for(int value: list){
                        degree[value]--;
                    }
                    flag = true;
                    break;
                }
            }
            if (flag == false){
                return new int[]{};
            }
        }
        return courses;
    }


}

