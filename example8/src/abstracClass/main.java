package abstracClass;

import shapes.Circle;
import shapes.Shape;
import shapes.Triangle;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape1 = new Triangle("rojo", 20.0, 10.0);
		Shape shape2 = new Circle("verde", 3.4);
		//polimorfismo
		System.out.println("triangle " + shape1.area() + " altura "   );
		System.out.println("circle " + shape2.area());
		
		
	}

}
