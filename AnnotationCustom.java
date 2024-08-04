  import java.lang.annotation.*;

   @Target({ElementType .TYPE,ElementType.METHOD,ElementType.FIELD})
   @Retention(RetentionPolicy.RUNTIME)
  @interface cricketplayer{
      
       String country() default "india";
       int age() default 34;


  }

public class AnnotationCustom {
    public static void main(String[] args){
     virat v=new virat();
     v.setrun(2002);
    int r= v.getrun();
    System.out.println(r);
     v.setinnge(150);
    int i= v.getInnge();
    System.out.println(i);

      Class c=v.getClass();
      Annotation a=c.getAnnotation(cricketplayer.class);
      cricketplayer cp=(cricketplayer)a;
      
      String country=cp.country();
      System.out.println(country);
      int age=cp.age();
      System.out.println(age);

    }
    
}
 @cricketplayer
class virat{
       @cricketplayer
    private  int runs;
     private int innge;
       @cricketplayer
     void setrun(int run){
        this.runs=run;
     }
     int getrun(){
        return runs;
     }
     void setinnge(int innge){
        this.innge=innge;
     }
     public int getInnge() {
         return innge;
     }
}