package example1;

public class Point3d extends Point {
	private Double z;
	public Point3d(Double x, Double y, Double z) {
		super(x, y);
		this.z  = z;
	}
	public String getPoints () {
		return "x=" + this.getX() + " y =" + this.getY() + " z=" + this.z;
	}
}
