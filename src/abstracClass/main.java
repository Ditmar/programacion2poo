package abstracClass;

import shapes.Circle;
import shapes.Shape;
import shapes.Triangle;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape triangle = new Triangle("rojo", 20.0, 10.0);
		Shape circle = new Circle("verde", 3.4);
		//polimorfismo
		System.out.println("triangle " + triangle.area() + " altura "  );
		System.out.println("circle " + circle.area());
		
		
	}

}
