
import java.util.Stack;

public class PushAtbottom {
    public static void pushAtBo(Stack<Integer>k,int data){
        if(k.isEmpty()){
          k.push(data);
          return;
        }
        int top=k.pop();
        pushAtBo(k, data);
         k.push(top);

    }
    public  static void main(String[] args){
        Stack<Integer> k=new Stack<>();
         k.push(1);
         k.push(2);
        k.push(3);

        pushAtBo(k,4);
        while(!k.isEmpty()){
            System.out.println(k.pop());
        }
    }
    
}
