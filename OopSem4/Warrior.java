package OopSem4;

import java.util.Random;

public abstract class Warrior<T extends Weapon> {
    private String name;

    protected T weapon;

    public Shield getMyshield() {
        return myshield;
    }

    public void setMyshield(Shield myshield) {
        this.myshield = myshield;
    }

    private Shield myshield;


    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    private int healthPoint;

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public Warrior(String name, T weapon, int healthPoint, Shield myshield) {
        this.name = name;
        this.weapon = weapon;
        this.healthPoint = healthPoint;
        this.myshield = myshield;
    }

    @Override
    public String toString() {
        return String.format("Name %s, weapon %s, healthPoint %d, shield %s", name, weapon, healthPoint, myshield);
    }

    public int hit() {
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }
}
