package OopSem4;

public class Assasin extends Warrior<Knife>{

    public Assasin(String name, Knife knife, int healthPoint, Shield myshield) {
        super(name, knife, healthPoint, myshield);
    }
    
    @Override
    public String toString() {
        return String.format("Assasin %s", super.toString());
    }
}

