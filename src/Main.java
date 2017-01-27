

public class Main {

    public static void main(String[] args) {
	// write your code here
        Character king = new King();
        Character queen = new Queen();
        Character knight = new Knight();
        Character troll = new Troll();

        king.setWeapon(new SwordBehavior());
        king.fight();

        queen.setWeapon(new KnifeBehavior());
        queen.fight();

        knight.setWeapon(new AxeBehavior());
        knight.fight();

        troll.setWeapon(new BowAndArrowBehavior());
        troll.fight();

        king.setWeapon(new BowAndArrowBehavior());
        king.fight();

        knight.setWeapon(new SwordBehavior());
        knight.fight();

        System.out.println("End of battle!\n");
    }
}
