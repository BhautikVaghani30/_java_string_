package addzero_string;

import javax.swing.*;
import java.util.Arrays;

public class string_pro_11 {
    public static void main(String[] args) {
        String str  = "hello my name is bhautik";
        int coutn = 0;
        char[] carr  = str.toCharArray();
//        System.out.println(Arrays.toString(carr));
        for (int i = 0; i < carr.length; i++) {
            if (carr[i] == '1'){
                continue;
            }
            coutn = 1;
            for (int j = i+1; j < carr.length; j++) {
                if (carr[i] == carr[j]){
                    coutn++;
                    carr[j] = '1';
                }
            }
            if (coutn > 1){
                System.out.println("duplicate charectors  : " + carr[i]);
            }
        }
    }
}
