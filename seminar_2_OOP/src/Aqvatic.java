package seminar_2_OOP.src;

public abstract class Aqvatic extends Animal {
    public Aqvatic(String name) {
        super(name);
    }

    public String feed() {
        return "plankton";
    }
}
