package minecraft;

import java.util.ArrayList;

import chunks.Cube;

public class Game {
	ArrayList<Cube> wordList;
	Hero hero;
	public Game(ArrayList<Cube> world) {
		this.wordList = world;
		hero = new Hero();
	}
	public void start() {
		for (Integer i =  0; i < this.wordList.size(); i++) {
			Cube myItem = null;
			Cube item = this.wordList.get(i);
			do {
				myItem = hero.mining(item);	
			} while(myItem == null);
			hero.addItem(myItem);
		}
		hero.showBag();
	}
}
