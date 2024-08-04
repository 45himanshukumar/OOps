  
   import java.util.*;

   public class Comparator {
       public static void main(String[] args) {
           Student s1 = new Student(23, 45, "Himanshu");
           Student s2 = new Student(21, 42, "Kapil");
           Student s3 = new Student(25, 35, "Akash");
   
           List<Student> list = new ArrayList<>();
           list.add(s1);
           list.add(s2);
           list.add(s3);
   
           Alpaaa a = new Alpaaa();
           Collections.sort(list, a); // Use the custom comparator to sort the list
   
           System.out.println(list);
       }
   }
   
   class Student {
       int age;
       int marks;
       String name;
   
       Student(int age, int marks, String name) {
           this.age = age;
           this.marks = marks;
           this.name = name;
       }
   
       int getMarks() {
           return marks;
       }
   
       int getAge() {
           return age;
       }
   
       String getName() {
           return name;
       }
   
       public String toString() {
           return marks + "-" + age + "-" + name;
       }
   }
   
   // Custom comparator for sorting by marks
   class Alpaaa implements Comparator<Student> {
       public int compare(Student a, Student b) {
           return Integer.compare(a.getMarks(), b.getMarks());
       }
    }
