package addzero_string;

import java.util.Arrays;

public class string_pro_10 {
    public static void main(String[] args) {
        String str = "hy my name is bhautik";
        System.out.println("befor update : " + str);
        String[] arr = null;
        arr = str.split(" ");
        int left = 0 , right = arr.length-1;
        while (left < right){

            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String str2 = Arrays.toString(arr);
        System.out.println("after update : " + str2);
    }
}
