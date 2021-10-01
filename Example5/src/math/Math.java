package math;

public class Math extends MathBase {
	
	public Vector3d add(Vector3d a, Vector3d b) {
		return new Vector3d(a.getX() + b.getX(), a.getY() + b.getY(), a.getZ() + b.getZ());
	}
	public Vector3d subtract (Vector3d a, Vector3d b) {
		return new Vector3d(a.getX() - b.getX(), a.getY() - b.getY(), a.getZ() - b.getZ());
	}
	public Vector3d multiply(Vector3d a, Vector3d b) {
		Double x = a.getY() * b.getZ() - b.getY() * a.getZ();
		Double y = (a.getX() * b.getZ() - b.getX() * a.getZ()) * -1;
		Double z = a.getX() * b.getY() - b.getX() * a.getY();
		
		return new Vector3d(x, y, z);
	}

}
