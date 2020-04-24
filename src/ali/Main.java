package ali;

public class Main {
    public static void main(String[] args){
        System.out.println(new Main().replace("abcabcdabc"));
    }

    public String replace(String str){
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length-2;){
            if(chars[i] == 'a' && chars[i+1] == 'b' && chars[i+2] == 'c'){
                chars[i] = 'x';
                chars[i+1] = 'y';
                chars[i+2] = 'z';
                i+=3;
            }else {
                i++;
            }
        }
        return String.valueOf(chars);
    }

}
