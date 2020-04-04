package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class T40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> integers = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int i = 0; i < arr.length; i++){
            if(integers.size()<k){
                integers.add(arr[i]);
            }else {
                if(integers.peek()>arr[i]){
                    integers.remove();
                    integers.add(arr[i]);
                }
            }
        }
        int[] array = new int[k];
        for(int i = 0; i < k; i++){
            array[k-i-1] =integers.remove();
        }
        return array;
    }
}
