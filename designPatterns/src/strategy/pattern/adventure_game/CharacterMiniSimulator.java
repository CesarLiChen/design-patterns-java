package strategy.pattern.adventure_game;

public class CharacterMiniSimulator {

	public static void main(String[] args) {

		Character king = new King();
		king.display();
		king.fight();
		king.performAttack();

		System.out.println("");

		Character queen = new Queen();
		queen.display();
		queen.fight();
		queen.performAttack();

		System.out.println("");

		Character knight = new Knight();
		knight.display();
		knight.fight();
		knight.performAttack();

		System.out.println("");

		Character troll = new Troll();
		troll.display();
		troll.fight();
		troll.performAttack();
	}
}
