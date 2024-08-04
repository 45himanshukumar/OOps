public class Paper {
    public static void main(String [] args){
       M obj=new M("himansh",35);
       M obj1=new M();
       M obj2=new M(obj);
       System.out.println(obj2.name);
       System.out.println(obj2.name);
          obj2.pass=123;
          System.out.println(obj2.pass);
      //  obj.name="himanshu";
      // A obj2=new A();
       //obj2.roll=35;
       System.out.println(obj.name); 
    }

    
}
class M{
    int roll;
    String name;
    int pass;
    void show(){
        System.out.println("show");
    }
    M(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    M(){
        System.out.println("non parameterised condructor");
    }
    // copy constructor
    M(M obj){
  this.name=name;
   this.roll=roll;
    }
    

}
//class A extends M{
    //String collage;
    //String city;
    //super.A(){

   // }
//}
