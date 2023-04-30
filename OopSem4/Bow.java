package OopSem4;

public class Bow implements Weapon{
    @Override
    public int damage() {
        return 20;
    }

    public int range(){
        return 50;
    }

    @Override
    public String toString() {
        return String.format("Bow, max damage %d, max range %d", damage(), range());
    }
}
