package math;

public class Point {
	protected Integer x, y;
	public Point(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	public void print() {
		System.out.println("(" + this.x + ",  " + this.y + ")");
	}
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	
}
