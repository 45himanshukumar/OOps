
 import java.io.*;
public class Fille {
    public static void main(String[] args)throws IOException  
    {
    File file=new File("him.txt");
    System.out.println(file.exists());
     
    file.createNewFile();
    System.out.println(file.exists());
    }
    
}
       