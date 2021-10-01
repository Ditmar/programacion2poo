package shapes;

public class Circle extends Shape {

	private Double radio;
	public Circle(String color, Double radio) {
		super(color);
		this.radio = radio;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return Math.PI * this.radio * this.radio;
	}

	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}

}
