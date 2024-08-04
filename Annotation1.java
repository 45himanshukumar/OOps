  import java.lang.*;
  
public class Annotation1 {
    public static void main(String[] args){
         plane c=new cargoplane();
         c.planefly();

    }
    
}

  class plane{

     public void planefly(){
        System.out.println("flyplane");

     }
  }
     
    class cargoplane extends plane{
           
           @Override
         public void planefly(){
            System.out.println("flycargoplane");
         }
    }
