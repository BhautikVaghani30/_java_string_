package addzero_string;

import javax.swing.plaf.IconUIResource;

public class string_pro_9 {
    public static void main(String[] args) {
        String str = "hy my name is bhautik";
//        char[] car = new char[str.length()];
        String str2 = new String();
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='y'){
                continue;
            }
            str2 += str.charAt(i);
        }
        System.out.println(str2);
    }
}
