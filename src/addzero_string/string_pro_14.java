package addzero_string;

public class string_pro_14 {
    public static void main(String[] args) {
        String str = "nayan nayan nayan nayx an nayan";
        String[] aStr = str.split(" ");
        for (int i = 0; i < aStr.length; i++) {
            boolean b = palindrom(aStr[i]);

            if (!b) {
                System.out.println("all worlds not are palindrom ");
                return;
            }
        }
        System.out.println("all worlds are palindrom ");
    }

    public static boolean palindrom(String s){

        int left = 0,right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
