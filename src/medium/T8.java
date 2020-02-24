package medium;

public class T8 {


    public static void main(String[] args){
        System.out.println(new T8().myAtoi("  0000000000012345678"));
    }

    public int myAtoi(String str) {

        /*
        state 的各值意义如下：
        0，未找到第一个非空字符。
        1，第一个非空字符为+或者数字。
        2、第一个非空字符为1。
         */
        int state = 0;
        int num = 0;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (state) {

                case 0:
                    if (c == '+' || (c >= '0' && c <= '9')) {
                        state = 1;
                        if(c == '+'){
                            break;
                        }
                        num = Integer.parseInt(String.valueOf(c));
                        break;
                    }
                    if (c == '-') {
                        state = 2;
                        break;
                    }
                    if (c == ' ') {
                        break;
                    } else {
                        return 0;
                    }

                case 1:
                    if (c < '0' || c > '9') {
                        return num;
                    } else {
                        int cnum = c -'0';
                        if(num > (Integer.MAX_VALUE-cnum)/10.0){
                            return Integer.MAX_VALUE;
                        }
                        else {
                            num = num*10 +cnum;
                            break;
                        }
                    }

                case 2:
                    if (c < '0' || c > '9') {
                        return num;
                    } else {
                        int cnum = c -'0';
                        if(num < (Integer.MIN_VALUE+cnum)/10.0){
                            return Integer.MIN_VALUE;
                        }
                        else {
                            num = num*10 -cnum;
                            break;
                        }
                    }
            }
        }
        return num;
    }
}
