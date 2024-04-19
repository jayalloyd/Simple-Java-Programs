package simple_progams;

class Swapping{
   static void swapping(int x,int y){
        int temp=x;
        x=y;
         y=temp;
       
        System.out.println("The numbers after swapping x: "+x  +" "+"The y is :"+y);
    }
}
public class SwappingOfNumbers {
    public static void main(String[] args) {
        Swapping obj=new Swapping();
        int x=9;
        int y=6;
        obj.swapping(x, y);
    }
}
