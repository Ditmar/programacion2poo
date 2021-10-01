package chunks;

public class RedStone extends Cube {

	public RedStone(Integer hard, Integer with, Integer height, String name) {
		super(hard, with, height, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Cube destroy() {
		// TODO Auto-generated method stub
		System.out.println("Te doy el polvo de redstone");
		return this;
	}

}
