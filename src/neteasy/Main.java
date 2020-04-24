package neteasy;

import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] graph = new int[n][m];
        int[][] people = new int[n][m];
        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j++){
                int a = scanner.nextInt();
                graph[i][j] = a;
                if(a == 0){
                    people[i][j] = 1;
                }
            }
        }


        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j++){
                System.out.println(people[i][j]);
                if(j != m-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
