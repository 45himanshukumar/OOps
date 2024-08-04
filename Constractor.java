public class Constractor {
    public static void main(String[] args) {
        mango obj=new mango("yellow",5);
        System.out.println(obj.count);
        obj.count=4;
        System.err.println(obj.count);
        obj.setcolor("green");
        System.out.println(obj.getcolor());
    }    
}
class mango{
    int count;
   private String color;
    void setcolor(String color){
        this.color=color;
    }
    mango(String newcolor,int count){
        this.color= newcolor;
        this.count=count;
    }
    String getcolor(){
        return this.color;
    }

}
class banana{
    int max;

}
