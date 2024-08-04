
public class oop1 {
    public static void main(String [] args){
        M ob=new M();
        ob.setroll(45);
        
        System.out.println(ob.getroll());
        ob.eat();
        ob.set("himanshu");
        System.err.println(ob.name);
        B ob2=new B();
        ob2.age=20;
        System.err.println(ob2.age);
        ob2.set(21);
        System.err.println(ob2.age);

    }
    
}

class M{
   private int roll;
    String name;
    void eat(){
        System.out.println("eats");
    }
    void set(String name){
        this.name=name;
    }
    int getroll(){
        return this.roll;
    }
   void setroll(int roll){
        this.roll=roll;
    }
}
class B{
    int age;
    String collage;
    void set(int newage){
        this.age=newage;
    }
}