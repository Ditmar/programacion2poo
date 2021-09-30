package shapes;

public class Triangle extends Shape {
	private Double base;
	private Double height;
	public Triangle(String color, Double base, Double height) {
		super(color);
		this.base = base;
		this.height  = height;
		// TODO Auto-generated constructor stub
	}
	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return this.base * this.height /2;
	}
	
	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	
	
}
