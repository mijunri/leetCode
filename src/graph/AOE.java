package graph;

import java.util.ArrayList;
import java.util.List;

public class AOE {


    /**
     *
     * @param n
     * @param aoe 一个三元组，[a,time,b],表示节点a到节点b消耗time时间。
     * @return
     */

    public int[] criticalPath(int n, int[][] aoe){
        int[] degree = new int[n];
        List<List<Node>> lists = new ArrayList<>();
        for(int i = 0; i < n; i ++){
            lists.add(new ArrayList<>());
        }
        for(int[] entry: aoe){
            int a = entry[0];
            int b = entry[2];
            int time = entry[1];
            Node node = new Node();
            node.time = time;
            node.nextNode = b;
            lists.get(a).add(node);
            degree[b]++;
        }

        return null;

    }

    static class Node{
        int time;
        int nextNode;
    }
}
