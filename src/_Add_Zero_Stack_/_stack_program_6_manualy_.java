package _Add_Zero_Stack_;
class stacks{
    public static int[] s = new int[5];
    public static int[] mins = new int[5];
    int top = -1;
    int mintop = -1;
//    stacks(){
//        int top = -1;
//        int mintop = -1;
//    }

    public boolean Empty(){
        return top == -1;
    }
   public void push(int i){
        if (this.top == s.length-1){
            System.out.println("stack is overflow");
            return;
        }
       top++;
       s[top] = i;
       if (mintop == -1){
           mintop++;
           mins[mintop] = i;
       } else if (mins[mintop] >= i) {
           mintop++;
           mins[mintop] = i;
       }
   }
    public void pop(){
        if (Empty()){
            System.out.println("stack is empty");
            return;
        }
        int temp = s[top];
        top--;
        if (mins[mintop] == temp ){
            mintop--;
        }
    }
    public int getmin(){
        if (Empty()){
            System.out.println("stack is empty");
            return -1;
        }
        System.out.println("currant min value is : "+mins[mintop]);
        return mins[mintop];
    }
    public void getstack(){
        for (int i = top; i >= 0; i--) {
            System.out.println(s[i]);
        }
    }
}
public class _stack_program_6_manualy_ {

    public static void main(String[] args) {
        stacks s = new stacks();
        boolean a = s.Empty();
//        System.out.println(a);
        s.push(10);
        s.push(9);
        s.push(3);
        s.push(2);
        s.push(1);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.getstack();
        s.getmin();

    }
}
