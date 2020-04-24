package lcp;

import sun.awt.image.ImageWatched;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LCP09 {

    public int minJump(int[] jump) {
        Deque<Integer> queue1 = new LinkedList<>();
        int[] visited = new int[jump.length];

        queue1.offer(0);
        visited[0] = 1;
        int cost = 0;
        int visitedlen = 0;
        int max = 0;
        int premax = 0;
        while (true){
            int size = queue1.size();

            while (size>0){
                int index = queue1.poll();
                int right = index+jump[index];
                max = max>right?max:right;
                if(right>=jump.length){
                    return cost+1;
                }
                queue1.offer(right);
                visited[right] = 1;
                size--;
            }
            for(int i = visitedlen+1; i < premax; i++){
                if(visited[i] == 0){
                    queue1.offer(i);
                    visited[i] = 1;
                }
            }
            visitedlen = premax;
            premax = max;

            cost++;
        }
    }



    public static void main(String[] args){
        int[] nums = new int[]{3,7,6,1,4,3,7,8,1,2,8,5,9,8,3,2,7,5,1,1};
        System.out.println(new LCP09().minJump(nums));
    }
}
