import java.util.ArrayList;

public class StackArrayListImp {

    // Dynamic stack implimentation using array array list 

    public static class MyStack{
       ArrayList<Integer> al = new ArrayList<>();

    // add data
    void push(int x){
        al.add(x);
    }

     // pop
    int pop(){
        int res = al.get(al.size()-1);
        al.remove(al.size()-1);
        return res;
    }

    // peek
    int peek(){
        return al.get(al.size()-1);
    }

    // size
    int size(){
        return al.size();
    }

    // check stack is empty
    boolean  isEmpty(){
        return al.isEmpty();
    }
    
    }
    public static void main(String[] args) {
      MyStack s = new MyStack();
      s.push(10);
      s.push(20);
      s.push(30);

      System.out.println(s.peek());
      System.out.println(s.size());
      System.out.println(s.isEmpty());
      
    }
}
