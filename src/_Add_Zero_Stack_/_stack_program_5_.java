package _Add_Zero_Stack_;
import java.util.Stack;
public class _stack_program_5_ {
    public static void main(String[] args) {

//       char[] s = new char[10];
//       int top = -1;
//       String str = "(){}[]";
//        for (int i = 0; i < str.length(); i++) {
//            if (isEmpty(top)){
//                top = push(s,top,str.charAt(i));
//            } else if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
//                top = push(s,top,str.charAt(i));
//
//            }
//            else if (str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')') {
//                if (peek(top) == '{'){
//                    top = pop(s,top);
//                } else if (peek(top) == '(') {
//                    top = pop(s,top);
//                }
//                else if (peek(top) == '[') {
//                    top = pop(s,top);
//                }else{
//                    System.out.println("not patern");
//                }
//
//            }
//            else{
//                System.out.println("not ");
//            }
//        }
                Stack<Character> s = new Stack<>();
                String str = "({}[]()";
        for (int i = 0; i < str.length(); i++) {

                if (s.empty()){
                    s.push(str.charAt(i));
                }
                else if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                    s.push(str.charAt(i));
                }
                else if (str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')') {
                    if (s.peek() == '{' && str.charAt(i) == '}'){
                        s.pop();
                    }
                    else if (s.peek()== '(' && str.charAt(i) == ')') {
                        s.pop();
                    }
                    else if (s.peek() == '[' && str.charAt(i) == ']') {
                        s.pop();
                    }
                    else{
                        System.out.println("not Balanced ");
                        return;
                    }
                }
                else{
                   System.out.println("not Balanced   ");
                   return;
                }

        }
        System.out.println("Balanced");
        return;


    }

//    private static int peek(int top) {
//        return top;
//    }
//
//    private static int pop(int[] s, int top) {
//        if (isEmpty(top)){
//            System.out.println("stack is empty");
//            return top;
//        }
////        System.out.println(s[top]);
//        top--;
//        return top;
//    }
//
//    private static int push(int[] s, int top, int d) {
//        if (top == s.length-1){
//            System.out.println("stacki is overflow");
//        }
//        top++;
//        s[top] = d;
//        return top;
//    }
//
//    private static void display(int[] s, int top) {
//        if (isEmpty(top)){
//            System.out.println("stack is empty");
//            return;
//        }
//        for (int i = top; i >= 0; i--) {
//            System.out.println(s[i]);
//        }
//        return;
//    }
//
//    private static int isSize(int top) {
//        return top;
//    }
//
//    private static boolean isEmpty(int top) {
//        if (top == -1){
//            return true;
//        }
//        return false;
//    }
}
