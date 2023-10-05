package addzero_string;

public class string_pro_7 {
    public static void main(String[] args) {
        String str = "dcefba";
        char[] st = str.toCharArray();

        for (int i = 0; i < str.length()-1; i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (st[i] > st[j]){
                    char temp = st[i];
                    st[i] = st[j];
                    st[j] = temp;
                }
            }
        }
        str = new String(st);
        System.out.println(str);
    }
}
