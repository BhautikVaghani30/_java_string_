package _Add_Zero_Stack_;

class twoStack {
    public static int[] s = new int[10];
    public static  int top = -1;
    public static int stop = s.length - 1;
}

class firstStack extends twoStack {
    public static int top = -1;

    public static void fpush(int i) {
        if (top == s.length - 1) {
            System.out.println("stack is overflow");
        }
        top++;
        s[top] = i;
        return;
    }

    public static void fpop() {
        if (top == -1) {
            System.out.println("stack is empty");
            return;
        }
        System.out.println("stack popped value is: " + s[top]);
        top--; // Decrement the top
        return;
    }

    public static void fdisp() {
        if (top == -1) {
            System.out.println("stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) { // Decrement i
            System.out.println(s[i]);
        }
    }
}
class secoundstack extends twoStack {
    public static int stop = s.length-1;

    public static void spush(int i) {
        if (stop >= top) {
            System.out.println("stack is overflow");
        }
        stop--;
        s[stop] = i;
        return;
    }

    public static void spop() {
        if (stop == s.length) {
            System.out.println("stack is empty");
            return;
        }
        System.out.println("stack popped value is: " + s[stop]);
        stop++; // Decrement the top
        return;
    }

    public static void sdisp() {
        if (stop == -1) {
            System.out.println("stack is empty");
            return;
        }
        for (int i = stop; i < s.length-1; i++) { // Decrement i
            System.out.println(s[i]);
        }
    }
}

public class _stack_program_12_ extends firstStack {
    public static void main(String[] args) {
        // Create an instance of firstStack (not necessary in this case)
        firstStack f = new firstStack();
        secoundstack S = new secoundstack();

        // Call the static methods using the class name
        firstStack.fpush(10);
        firstStack.fpush(20);
        firstStack.fpush(30);
        firstStack.fpush(40);
        firstStack.fpush(50);
        firstStack.fpush(60);



        firstStack.fdisp();
        System.out.println("-----------------------------------------------------------------");
        secoundstack.spush(1);
        secoundstack.spush(2);
        secoundstack.spush(3);
        secoundstack.spush(4);
        secoundstack.spush(5);
        secoundstack.spush(5);
        secoundstack.spush(5);
        secoundstack.sdisp();


    }
}

