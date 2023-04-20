package seminar_2_OOP.src;
public abstract class Herbivores extends Animal{
    public Herbivores(String name) {
        super(name);
    }
    public String feed(){
        return "grass";
    }
}
