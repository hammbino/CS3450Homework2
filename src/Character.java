/**
 * Homework2
 * Created by jeffreyhammond on 1/24/17.
 */
abstract class Character {

    WeaponBehavior weapon;

    Character() {
    }

    public abstract void fight();

    void setWeapon(WeaponBehavior wb) {
        this.weapon = wb;
        System.out.println("Sets weapon.");
    }
}
