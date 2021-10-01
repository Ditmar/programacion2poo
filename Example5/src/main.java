import math.Math;
import math.Vector3d;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math math = new Math();
		System.out.println(math.add(10, 12));
		System.out.println(math.subtract(10, 12));
		System.out.println(math.multiply(10, 12));
		System.out.println(math.divide(10, 12));
		
		Vector3d vectora = new Vector3d(2.0, 0.0, 1.0);
		Vector3d vectorb = new Vector3d(1.0, -1.0, 3.0);
		Vector3d result1 = math.add(vectora, vectorb);
		result1.showVector();
		Vector3d result2 = math.subtract(vectora, vectorb);
		result2.showVector();
		Vector3d result3 = math.multiply(vectora, vectorb);
		result3.showVector();
		
		
	}

}
