package addzero_string;

public class string_pro_12 {
    public static void main(String[] args) {

            String str = "hel2lo worl3d m6y n3am4e is b3ha8u2t4i9k";
            String str2 = new String();
            for (int i = 0; i < str.length(); i++) {
                int ascii = str.charAt(i);
                if (ascii >= 48 && ascii <= 57) {
                    continue;
                }
                str2 += str.charAt(i);
            }
            System.out.println(str2);

    }
}
