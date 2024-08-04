  enum Result{
     PASS,FAIL,NR;
  }

public class Enumm {
    public static void main(String[] args){

      Result  r= Result.FAIL;
      System.out.println(r);
     int inx= Result.FAIL.ordinal();
     System.out.println(inx);
      Result[] aa= Result.values();

      for(Result w1:aa){
        System.out.println(w1);
      }
    }
    
}
