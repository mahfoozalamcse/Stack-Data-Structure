public class StackIMPArray {
    public static class MyStack{
        int arr[];
        int cap;
        int top;
        MyStack(int c){
            cap = c;
            arr = new int[c];
            top = -1;
        }
    
    // insert 
     void push(int x){
       if (top == cap -1) {
         System.out.println("stack full over flow error");
       }
       top++;
       arr[top] = x;
    }

    // delete
     int pop(){
        if (top == -1) {
            return -1;
        }
        int res = arr[top];
        top--;
        return res;
    }

    int peek(){
        if (top == -1) {
            return -1;
        }
        return arr[top];
    }

    // check size
    int size(){
        return top+1;
    }

    // check stack is empty or not
    boolean isEmpty(){
        return (top == -1);
    }
}


    public static void main(String[] args) {
        MyStack s = new MyStack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
    }
}