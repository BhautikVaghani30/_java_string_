package addzero_string;

import java.time.format.SignStyle;

public class string_pro_8 {
    public static void main(String[] args) {
        String str  = "good morninig";
        int[] frq = new int[127];
        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i);
            frq[ascii] = frq[ascii]+1;
        }
        for (int i = 0; i < frq.length; i++) {
            if (frq[i] > 0){
                System.out.println((char) i +" : "+ frq[i]);
            }
        }
    }
}
