package addzero_string;

import java.util.Arrays;

public class string_pro_2 {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("befor string : "+ str);
        int n = str.length();
        char[] carArr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            carArr[i] = str.charAt(n-i-1);
            carArr[str.length()-i-1] = temp;
        }
        str = new String(carArr);
        System.out.println("after string : "+ str);


    }
}
