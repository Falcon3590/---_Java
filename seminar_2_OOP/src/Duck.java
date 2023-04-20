package seminar_2_OOP.src;
public class Duck extends Herbivores implements Walkable, Flyable{
    public Duck(String name) {
        super(name);
    }


    @Override
    public String say() {
        return "Krya-krya-krya";
    }

    @Override
    public int speedForFly() {
        return 80;
    }

    @Override
    public int speedForWalk() {
        return 5;
    }
}
