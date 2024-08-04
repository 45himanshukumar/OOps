
     enum Result1{
          PASS,FAIL,NR;

     Result1() {
        System.out.println("constractor");
    }
        int marks;
        void setmarks(int marks){
            this.marks=marks;
        }
        

        int getmarks(){
            return marks;
        }

          
     }

public class Ennum1 {
    public static void main(String[] args){

        Result1.PASS.setmarks(50);
        int m=Result1.PASS.getmarks();
        System.out.println(m);

       int n= Result1.FAIL.getmarks();
       System.out.println(n);
    }
    
}
