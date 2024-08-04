

public class Abstract {
    public static void main(String [] args){
        horse obj=new horse();
        obj.walk();
        obj.eat();
       obj.changeColor();
       Animal a= new Animal("brown");
           System.out.println(a.color);
       a.walk();

    }    
}

  class Animal{
    String color;
    void eat(){
        System.out.println("is eats");
    }
      Animal(String color){
        this.color=color;
      }
       void walk(){
        System.out.println("walk");
       }

}
  class horse extends Animal{
    void walk(){
        System.out.println("is walk");
    }
    void changeColor(){
        this.color="darkbrown";
        System.out.println(this.color);
    }
  }
