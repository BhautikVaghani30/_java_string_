package addzero_string;

public class string_pro_16 {
    public static void main(String[] args) {
        String str = "hello world";
        StringBuilder sb = new StringBuilder("");
        int[] arr = new int[128];
        for (char ch : str.toCharArray()) {
            int ascii = ch;
            if (arr[ch -1] == 0) {
                arr[ch -1 ] = 1;
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
