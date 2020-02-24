package medium;
/*
Z字形变换
 */
public class T6 {

    public static void main(String[] args){
        System.out.println(new T6().convert("a",1));
    }

    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numRows; i++){
            int j = i;
            boolean flag = true;
            while(j<s.length()){
                sb.append(s.charAt(j));
                if((i!=numRows-1)&&(flag || i==0 )){
                    j = j+2*(numRows - 1-i);
                }else {
                    j = j+2*(i);
                }
                flag = !flag;
            }
        }
        return sb.toString();
    }
}
