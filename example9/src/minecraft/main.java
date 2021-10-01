package minecraft;

import java.util.ArrayList;

import chunks.Coal;
import chunks.Cube;
import chunks.Earth;
import chunks.RedStone;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coal coal = new Coal(10, 1, 1, "Carbon");
		Earth earth = new Earth(7, 1, 1, "Tierra");
		RedStone redstone = new RedStone(20, 1, 1, "red stone");
		ArrayList<Cube> list = new ArrayList();
		list.add(coal);
		list.add(earth);
		list.add(redstone);
		Game game = new Game(list);
		game.start();
	}
	
}
