package Vehicle;
import Fruit.Mango;
import polymorphism.*;
public class Car extends Mango{
	public static void main(String[] args) {
		System.out.println("From Car class");
		System.out.println(Mango.a);
		Mango.test();
		System.out.println(Mango.b);
		Mango.demo();
		
		Mango m1=new Mango();
	}

}
