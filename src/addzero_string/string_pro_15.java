package addzero_string;

public class string_pro_15 {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = "helso";

        if (str.length() != str2.length()) {
            System.out.println("not equal");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str2.charAt(i)) {
                System.out.println("not same or equal");
                return;
            }
        }
        System.out.println("both are same");
    }
}
