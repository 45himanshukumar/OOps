  import java.util.ArrayList;
public class StackC {
    static class stackk{
        static ArrayList<Integer> list2=new ArrayList<>();

        public static boolean isEmpty(){
            return list2.size()==0;
        }
        public static void push(int data){
            list2.add(data);
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list2.get(list2.size()-1);
            list2.remove(list2.size()-1);
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list2.get(list2.size()-1);
        }
    }
    public static void main(String[] args){
        stackk s=new stackk();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
              s.pop();
        }

    }
    
}
