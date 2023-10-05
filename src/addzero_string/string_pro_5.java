package addzero_string;

public class string_pro_5 {
    public static void main(String[] args) {
        String str = "hello";
        String str1 = "hello";
        if (str.length() != str1.length()){
            System.out.println("not same");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str1.charAt(i)){
            }
            else{
                System.out.println("not same");
                return;
            }
        }
        System.out.println("String are same");
    }
}
