/**
 * Homework2
 * Created by jeffreyhammond on 1/24/17.
 */
public abstract class Character {

    WeaponBehavior weaponBehavior;

    public Character() {
    }

    public abstract void fight();

    public void useWeapon() {
        weaponBehavior.useWeapon();
    }

    public void setWeapon(WeaponBehavior wb) {
        weaponBehavior = wb;
        System.out.println("Sets weapon.");
    }
}
