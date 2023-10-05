package addzero_string;

import java.util.Arrays;

public class string_pro_4 {
    public static void main(String[] args) {
        String str = "hy my name is bhautik";
        str = str.trim(); //it is used to remove wihte space at the end of string and begining of string
        String[] strar = str.split(" ");
        int length = strar.length;
        System.out.println(length);
        int coutn = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                coutn++;
            }
        }
        System.out.println("the world in a string is : " + (coutn+1));


    }
}
