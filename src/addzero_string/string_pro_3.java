package addzero_string;

public class string_pro_3 {
    public static void main(String[] args) {
        String str = "nayand";
        int left = 0;
        int right = str.length()-1;
        while (left<right){
            if (str.charAt(left) != str.charAt(right)){
                System.out.println("not palindrom");
                return;
            }
            left++;
            right--;
        }
        System.out.println("palindrom");
    }
}
