package _Add_Zero_Stack_;

import java.util.Stack;

public class _stack_program_4_ {
    public static void main(String[] args) {
        int[] s = new int[10];
        int[] t = new int[10];
        int top = -1;
        int h = -1;

        top = push(s,top , 10);
        top = push(s,top , 20);
        top = push(s,top , 30);
        top = push(s,top , 40);
        top = push(s,top , 50);
        top = push(s,top , 60);
        top = push(s,top , 70);


        System.out.println("---------------------------------------------------------------------------------");
        display(s,top);



        int n = isSize(top);
        for (int i = 0; i < n/2; i++) {
            top = pop(s,top);
            h = push(t,h,s[top+1]);
        }

        top = pop(s,top);


        n = isSize(h);
        for (int i = n; i >= 0; i--) {
            h = pop(t,h);
            top = push(s,top,t[h+1]);
        }

        System.out.println("---------------------------------------------------------------------------------");
        display(s,top);
//


//        Stack<Integer> s = new Stack<>();
//        Stack<Integer> t = new Stack<>();
//        s.push(10);
//        s.push(20);
//        s.push(30);
//        s.push(40);
//        s.push(50);
//        s.push(60);
//        int n = s.size();
////        System.out.println(n);
//        for (int i = 0; i < n/2; i++) {
//            t.push(s.pop());
//        }
//        s.pop();
//        n = t.size();
//        for (int i = 0; i < n; i++) {
//            s.push(t.pop());
//        }
//        while (!s.isEmpty()) {
//            Integer element = s.pop();
//            System.out.println(element);
//        }



    }

    private static int pop(int[] s, int top) {
        if (isEmpty(top)){
            System.out.println("stack is empty");
            return top;
        }
//        System.out.println(s[top]);
        top--;
        return top;
    }

    private static int push(int[] s, int top, int d) {
        if (top == s.length-1){
            System.out.println("stacki is overflow");
        }
        top++;
        s[top] = d;
        return top;
    }

    private static void display(int[] s, int top) {
        if (isEmpty(top)){
            System.out.println("stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(s[i]);
        }
        return;
    }

    private static int isSize(int top) {
        return top;
    }

    private static boolean isEmpty(int top) {
        if (top == -1){
            return true;
        }
        return false;
    }
}
