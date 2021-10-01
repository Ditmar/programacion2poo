package chunks;

public class Coal extends Cube {

	public Coal(Integer hard, Integer with, Integer height, String name) {
		super(hard, with, height, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Cube destroy() {
		// TODO Auto-generated method stub
		System.out.println("Te doy un carbon");
		return this;
	}

}
