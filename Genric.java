import java.util.*;
  
public class Genric {
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(5);
        al.add(15);
        al.add(7);
        al.add(8);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        ArrayList<String> al2=new ArrayList<String>();
        al2.add("himanshu");
        al2.add("kapil");
        al2.add("rohan");
        al2.add("Ram");
        System.out.println(al2);
        Collections.sort(al2);
        System.out.println(al2);
        ArrayList<Integer> al3=new ArrayList<Integer>();
        al3.add(5);
        al3.add(15);
        al3.add(7);
        al3.add(8);
        
        Collections.rotate(al3,3);
        Collections.shuffle(al3);
        Collections.frequency(al3, 15);
         System.out.println(al3);
    }
    
}


