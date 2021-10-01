package minecraft;

import java.util.ArrayList;

import chunks.Cube;

public class Hero {
	ArrayList<Cube> bag;
	public Hero () {
		this.bag = new ArrayList<>();
	}
	public void addItem(Cube item) {
		this.bag.add(item);
	}
	public Cube mining(Cube cubeOfminin) {
		System.out.println("Nombre: " + cubeOfminin.getName() + " dureza " + cubeOfminin.getHard());
		if(cubeOfminin.mine(1)) {
			return cubeOfminin.destroy();
		}
		return null;
	}
	public void showBag() {
		for (Integer i = 0; i < this.bag.size(); i++) {
			System.out.println(this.bag.get(i).getName());
		}
	}
}
