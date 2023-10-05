package _Add_Zero_Stack_;

public class _stack_program_2_ {
    public static void main(String[] args) {
        String str = "good mornig";
        char[] c = new char[str.length()];
        int top = -1;
        for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i) == ' '){
            while (!iSEmpty(top)){
                top = pop(c, top);
            }
            System.out.println(" ");
           }
           else{

            top = push(c,top,str.charAt(i));
           }
        }while (!iSEmpty(top)){
            top = pop(c, top);
        }

    }
    private static boolean iSEmpty(int top){
        if (top == -1){
            return true;
        }
        return false;
    }
    private static int pop(char[] c, int top) {
        if (iSEmpty(top)){
            System.out.println("stack is empty");
            return top;
        }
        System.out.print(c[top]);
        top--;
        return top;
    }



    private static int push(char[] c, int top, char c1) {
        if (top == c.length-1){
            System.out.println("stack is owerflow");
            return top;
        }
        top++;
        c[top] = c1;
        return top;
    }
}
