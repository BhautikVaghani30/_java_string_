package _Add_Zero_Stack_;



public class _Simple_Stack_program_ {
    public static void main(String[] args) {
        int[] s = new int[5];
        int top = -1;
        top = push(s,top,10);
        top = push(s,top,20);
        top = push(s,top,30);
        top = push(s,top,40);
        top = push(s,top,50);
//        top = push(s,top,60);
//        top = pop(s, top);
//        top = pop(s, top);
//        top = pop(s, top);
//        top = pop(s, top);
//        top = pop(s, top);
        display(s,top);
        System.out.println("peek is : "+peek(top));
//        System.out.println("stack is empty : " + isEmpty(top));
    }

    private static int peek(int top) {
        return top;
    }

    private static boolean isEmpty(int top) {
        if (top == -1) {
            return true;
        }
        return false;
    }
    private static void display(int[] s, int top) {
        if (top == -1){
            System.out.println("stack is empty");
            return;
        }
        for (int i = top; i >= 0 ; i--) {
            System.out.println("stack value is : " + s[i]);
        }
    }

    private static int pop(int[] s, int top) {
        if (top == -1){
            System.out.println("stack  is empty");
            return top;
        }
        System.out.println("poped element is : "+s[top]);
        top--;
        return top;
    }

    private static int push(int[] s, int top, int v) {
        if (top == s.length-1){
            System.out.println("stack owerflow");
            return top;
        }
        top++;
        s[top] = v;
        return top;
    }
}
