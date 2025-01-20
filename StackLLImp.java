public class StackLLImp {
    public static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    // End Node
    // stack Implimentation
    public static class MyStack{
        Node head;
        int size;
        MyStack(){
            head = null;
            size = 0;
        }

        // return size
        int size(){
            return size;
        }

        // check empty or not

        boolean isEmpty(){
            return (head == null);
        }

        // push data

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        // delete data

        int pop(){
            if (head == null) {
                return Integer.MAX_VALUE;
            }
            int res = head.data;
            head = head.next;
            size--;
            return res;
        }

        // peek data

        int peek(){
            if (head == null) {
                return Integer.MAX_VALUE;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.pop());
    }
}
