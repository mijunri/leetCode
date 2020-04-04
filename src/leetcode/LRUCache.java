package leetcode;

import java.util.*;

public class LRUCache {
    int size;
    Map<Integer,Integer> map = new LinkedHashMap<>();

    public LRUCache(int capacity) {
        size = capacity;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            int value = map.get(key);
            map.put(key,value);
            return value;
        }else{
            return -1;
        }
    }

    public void put(int key, int value) {
        if(map.containsKey(key) || map.size()<size){
            map.put(key,value);
            return;
        }else{
            Iterator<Integer> iterator = map.keySet().iterator();
            map.remove(iterator.next());
            map.put(key,value);
        }
    }

    public static void main(String[] args){
        LRUCache cache = new LRUCache(2);
        cache.put(1,1);
        cache.put(2,2);
        cache.get(1);
        cache.put(3,3);
        int k = cache.get(2);
    }
}
