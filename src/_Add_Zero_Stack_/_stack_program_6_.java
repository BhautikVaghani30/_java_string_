package _Add_Zero_Stack_;

import org.w3c.dom.ls.LSOutput;

import java.util.Stack;

public class _stack_program_6_ {
   static Stack<Integer> St = new Stack<>();
    static Stack<Integer> minSt = new Stack<>();
    public static void main(String[] args) {

        push(1);
        push(20);
        push(30);
        push(0);
        push(50);
        pop();
        pop();
        System.out.println(St);
        System.out.println(minSt);
        getmin();
    }

    private static void push(int i) {

        St.push(i);
        if (minSt.empty()){
            minSt.push(i);
        }
        else if (minSt.peek() >= St.peek()){
            minSt.push(i);
        }

    }
    private static void getmin(){
        System.out.println(minSt.peek());
    }
    private static void pop() {
        if (St.empty()){
            System.out.println("stack is empty");
        }
        int temp = St.pop();

        if (minSt.peek() == temp){
            minSt.pop();
        }

    }
}
