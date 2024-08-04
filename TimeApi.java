import java.time.*;
public class TimeApi {
    public static void main(String [] args){
       LocalDate date= LocalDate.now();
       //System.out.println(date);
       int day=date.getDayOfMonth();
       int month=date.getMonthValue();
      int year= date.getYear();
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonth());
      System.out.println(day+ "/"+ month + "/"+   year);

      LocalTime time=LocalTime.now();
       int h=  time.getHour();
       int m=  time.getMinute();
      int s=   time.getSecond();
       int n=time.getNano();
         System.out.println(h+":"+ m  +":"+ s+":"+n);
         //System.out.println(time.getClass());
    }
    
}
