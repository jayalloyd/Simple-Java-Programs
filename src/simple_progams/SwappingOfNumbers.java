package simple_progams;
class Swapping{
	public void swappingNumbers(int x,int y) {
		int temp=x;
		x=y;
		y=temp;
		System.out.println("The values after swapping x:"+x +""+ "the value of y :"+y);
	}
}
public class SwappingOfNumbers {
public static void main(String a[]) {
	Swapping obj=new Swapping();
	obj.swappingNumbers(4, 6);
}
}
