package leetcode;

//罗马数字
public class T12 {

    public String intToRoman(int num) {
        int[] values = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] keys = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < values.length; i++){
            while (num >= values[i]){
                num -= values[i];
                sb.append(keys[i]);
            }
        }
        return sb.toString();
    }
}