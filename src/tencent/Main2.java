package tencent;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;


public class Main2 {
    Deque<Integer> stack1 = new LinkedList<>();
    Deque<Integer> stack2 = new LinkedList<>();

    public void add(int v){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(v);
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public void poll(){

        int k = stack1.pop();

    }

    public int peek(){

        int k = stack1.pop();
        stack1.push(k);
        return k;
    }



    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Main2 m = new Main2();
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n; i++){
            String s = scanner.nextLine();
            if(s.equals("poll")){
                m.poll();
            }
            else if(s.equals("peek")){
                sb.append(m.peek()).append("\n");
            }
            else {
                String[] array = s.split(" ");
                int v = Integer.parseInt(array[1]);
                m.add(v);
            }
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
