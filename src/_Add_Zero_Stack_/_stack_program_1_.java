package _Add_Zero_Stack_;

public class _stack_program_1_ {
    public static void main(String[] args) {
        char[] c = new char[5];
        int top = -1;
        String str  = "hello";
        for (int i = 0; i < str.length(); i++) {

        top = push(c, top, str.charAt(i));
        }

        for (int i = 0; i < c.length; i++) {

            top = pop(c, top);
        }
    }
    private static boolean isEmpty(int top){
        if (top == -1){
            return true;
        }
        return false;
    }


    private static int pop(char[] c, int top) {
        if (isEmpty(top)){
            System.out.println("stack is empty");
            return top;
        }
        System.out.print(c[top]);
        top--;
        return top;
    }



    private static int push(char[] c, int top, char c1) {
        if (top == c.length-1){
            return top;
        }
        top++;
        c[top] = c1;
        return top;
    }
}
