package math;

public class Point3d extends Point{
	protected Integer z;
	public Point3d(Integer x, Integer y, Integer z) {
		super(x, y);
		this.z = z;
	}
	@Override
	public void print() {
		System.out.println("(" + this.x + ",  " + this.y + "  " + this.z + ")");
	}
}
