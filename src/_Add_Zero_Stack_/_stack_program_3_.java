package _Add_Zero_Stack_;

public class _stack_program_3_ {
    public static void main(String[] args) {
        String s = "nayan";
        char[] str = new char[s.length()];
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            top = push(str,top,s.charAt(i));
        }
        if (s.equals(display(str,top))){
            System.out.println("palindrom");
        }
        else {
            System.out.println("not palindrom");
        }


    }

    private static String display(char[] str, int top) {
        if (isEmpty(top)) {
            System.out.println("is empty");
        }
        String s = new String();
        for (int i = top; i >= 0; i--) {
            s += str[i];
        }
        return s;
    }


    private static char peek(char[] str, int top) {
        return str[top];
    }

    private static int isSize(int top) {
        return top+1;
    }

    private static int pop(char[] str, int top) {
        if (isEmpty(top)) {
            return top;
        }
        System.out.println(str[top]);
        top--; // Decrement top before returning
        return top;
    }


    private static int push(char[] str, int top, char s) {
        if (top == str.length-1){
            System.out.println("stack is overflow");
            return top;
        }
        top++;
        str[top] = s;
        return top;
    }

    private static boolean isEmpty(int top) {
        if (top == -1){
            return true;
        }
        return false;
    }



}
