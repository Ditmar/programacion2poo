package chunks;

public class Earth  extends Cube{

	public Earth(Integer hard, Integer with, Integer height, String name) {
		super(hard, with, height, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Cube destroy() {
		// TODO Auto-generated method stub
		System.out.println("Te doy un cubo de tierra");
		return this;
	}

}
