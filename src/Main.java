

public class Main {

    public static void main(String[] args) {
	// write your code here
        Character king = new King();
        Character queen = new Queen();
        Character knight = new Knight();
        Character troll = new Troll();

        king.fight();
        king.setWeapon(new SwordBehavior());
        king.useWeapon();

        queen.fight();
        queen.setWeapon(new KnifeBehavior());
        queen.useWeapon();

        knight.fight();
        knight.setWeapon(new AxeBehavior());
        knight.useWeapon();

        troll.fight();
        troll.setWeapon(new BowAndArrowBehavior());
        troll.useWeapon();

        king.fight();
        king.setWeapon(new BowAndArrowBehavior());
        king.useWeapon();


        knight.fight();
        knight.setWeapon(new SwordBehavior());
        knight.useWeapon();

        System.out.println("End of battle!\n");
    }
}
