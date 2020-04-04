package test;

public class S2 {

    public static void main(String[] args){
        int i = 0;
        while (true){
            if(isfive(i)){
                System.out.println(i);
                return;
            }
            i++;
        }
    }

    public static  boolean isfive(int num){
        for(int i = 0; i < 5; i++){
            if(num%5 != 1){
                return false;
            }
            num = (num-1)/5*4;
        }
        return true;
    }
}
