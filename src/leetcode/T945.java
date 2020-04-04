package leetcode;

import java.util.Arrays;

public class T945 {

    public static void main(String[] args){
        int[] nums = new int[]{1,1,1,1,1,2,2};
        System.out.println(new T945().minIncrementForUnique(nums));
    }

    public int minIncrementForUnique(int[] A) {
        if(A.length < 1){
            return 0;
        }

        Arrays.sort(A);
        int count = 0;
        int min = 0;
        for(int i = 1; i< A.length ; i++){
            if(A[i] == A[i-1]){
                count++;
            }else if(count > 0){
                int len = A[i]-A[i-1]-1;
                if(count <= len){
                    min+=(1+count)*count/2;
                    count = 0;
                }else {
                    min+=(1+len)*len/2+(count-len)*(len+1);
                    count=count-len;
                }
            }
        }
        if(count>0){
            min+=(1+count)*count/2;
        }
        return min;
    }

}
