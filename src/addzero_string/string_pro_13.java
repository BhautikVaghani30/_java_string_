package addzero_string;

public class string_pro_13 {
    public static void main(String[] args) {
        String str = "hello good";
        String str2 = "wolrd evning";
        String[] arr = str.split(" ");
        String[] arr2 = str2.split(" ");
        String sb = new String();
        for (int i = 0; i < arr2.length; i++) {
            sb += " " + arr[i];
            sb += " " + arr2[i];

        }
        System.out.println(sb);
    }
}
