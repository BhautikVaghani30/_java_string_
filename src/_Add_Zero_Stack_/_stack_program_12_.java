package _Add_Zero_Stack_;

//class twoStack {
//    public static int[] s = new int[10];
//    public static  int top = -1;
//    public static int stop = s.length - 1;
//}
//
//class firstStack extends twoStack {
//    public static int top = -1;
//
//    public static void fpush(int i) {
//        if (top == s.length - 1) {
//            System.out.println("stack is overflow");
//        }
//        top++;
//        s[top] = i;
//        return;
//    }
//
//    public static void fpop() {
//        if (top == -1) {
//            System.out.println("stack is empty");
//            return;
//        }
//        System.out.println("stack popped value is: " + s[top]);
//        top--; // Decrement the top
//        return;
//    }
//
//    public static void fdisp() {
//        if (top == -1) {
//            System.out.println("stack is empty");
//            return;
//        }
//        for (int i = top; i >= 0; i--) { // Decrement i
//            System.out.println(s[i]);
//        }
//    }
//}
//class secoundstack extends twoStack {
//    public static int stop = s.length-1;
//
//    public static void spush(int i) {
//        if (stop >= top) {
//            System.out.println("stack is overflow");
//        }
//        stop--;
//        s[stop] = i;
//        return;
//    }
//
//    public static void spop() {
//        if (stop == s.length) {
//            System.out.println("stack is empty");
//            return;
//        }
//        System.out.println("stack popped value is: " + s[stop]);
//        stop++; // Decrement the top
//        return;
//    }
//
//    public static void sdisp() {
//        if (stop == -1) {
//            System.out.println("stack is empty");
//            return;
//        }
//        for (int i = stop; i < s.length-1; i++) { // Decrement i
//            System.out.println(s[i]);
//        }
//    }
//}
//
//public class _stack_program_12_ extends firstStack {
//    public static void main(String[] args) {
//        // Create an instance of firstStack (not necessary in this case)
//        firstStack f = new firstStack();
//        secoundstack S = new secoundstack();
//
//        // Call the static methods using the class name
//        firstStack.fpush(10);
//        firstStack.fpush(20);
//        firstStack.fpush(30);
//        firstStack.fpush(40);
//        firstStack.fpush(50);
//        firstStack.fpush(60);
//
//
//
//        firstStack.fdisp();
//        System.out.println("-----------------------------------------------------------------");
//        secoundstack.spush(1);
//        secoundstack.spush(2);
//        secoundstack.spush(3);
//        secoundstack.spush(4);
//        secoundstack.spush(5);
//        secoundstack.spush(5);
//        secoundstack.spush(5);
//        secoundstack.sdisp();
//
//
//    }
//}
public class _stack_program_12_ {
    static int arr[] = new int[10];
    static int top = -1;
    static int sectop = arr.length;

    static class Stack1{

        public void push(int num){
            if(top + 1 == sectop){
                System.out.println("Stack Overflow");
                return;
            }

            top++;
            arr[top] = num;
        }

        public int pop(){
            if(top == -1){
                System.out.println("Stack Empty");
                return -1;
            }
            int temp = arr[top];
            top--;
            return temp;
        }

        public boolean isEmpty(){
            return top == -1;
        }
        public static void disp() {
            if (top == -1) {
            System.out.println("stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) { // Decrement i
            System.out.println(arr[i]);
        }
    }
    }

    static class Stack2{

        public void push(int num){
            if(sectop-1 == top){
                System.out.println("Stack Overflow");
                return;
            }

            sectop--;
            arr[sectop] = num;
        }

        public int pop(){
            if(sectop == arr.length){
                System.out.println("Stack Empty");
                return -1;
            }
            int temp = arr[sectop];
            sectop++;
            return temp;
        }

        public boolean isEmpty(){
            return sectop == arr.length;
        }
        public static int disp() {
            if (sectop == arr.length) {
                System.out.println("Stack Empty");
                return -1;
            }
            for (int i = sectop; i <= arr.length-1; i++) { // Decrement i
                System.out.println(arr[i]);
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Stack1 s1 = new Stack1();
        Stack2 s2 = new Stack2();
        System.out.println(s2.isEmpty());
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.push(60);
        s1.disp();
        System.out.println("-----------------------------------------------------------------------");
        s2.push(1);
        s2.push(2);
        s2.push(3);
        s2.push(4);
        s2.push(5);
//        s2.push(6);
//        s2.push(7);

        s2.disp();

    }
}

