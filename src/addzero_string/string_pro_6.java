package addzero_string;

import java.util.Arrays;

public class string_pro_6 {
    public static void main(String[] args) {
        String str = "hello";
        char[] carr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o'){
                carr[i] = 'i';
                continue;
            }
            carr[i] = str.charAt(i);
        }
        str = new String(carr);
        System.out.println(str);
    }
}
