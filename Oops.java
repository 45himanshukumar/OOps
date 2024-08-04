class name{
    int roll;
    String name;
    String collage;
    void show(){
     System.out.println("show");
    }
}
    class b extends name{
        void display(){
            System.out.println("dispaly");
        }
    }

public class Oops {
    public static void main(String [] args){
        b obj=new b();
        obj.roll=35;
        obj.name="himanshu";
        obj.show();
        obj.display();
        

    }
}
