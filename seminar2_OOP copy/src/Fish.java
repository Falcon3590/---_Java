package seminar2_OOP.src;

public class Fish extends Aqvatic implements Floating {
    public Fish(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Bul-bul-bul";
    }

    @Override
    public String toString() {
        return String.format("Fish, %s", super.toString());
    }

    @Override
    public int speedSwimming() {
        return 30;
    }
}
