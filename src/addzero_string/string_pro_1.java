package addzero_string;

public class string_pro_1 {
    public static void main(String[] args) {
        String str = "hello";
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
    }
}
