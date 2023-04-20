package seminar2_OOP.src;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> listAnimal = new ArrayList<>();

    public List<Animal> getListAnimal(){
        return listAnimal;
    }
    public Zoo addList(Animal animal){
        listAnimal.add(animal);
        return this;
    }
    private Radio radio;

    public void setRadio(Radio radio) {
        this.radio = radio;
    }
    public List<Sayable> getSayble(){
        List<Sayable> sayables = new ArrayList<>();
        for (var item: listAnimal) {
            sayables.add(item);
        }
        sayables.add(radio);
        return sayables;
    }

    public List<Walkable> walkables(){
        List<Walkable> walkables = new ArrayList<>();
        for (var item:listAnimal) {
            if(item instanceof Walkable)
                walkables.add((Walkable) item);
        }
        return walkables;
    }
    public List<Flyable> flyables(){
        List<Flyable> flyables = new ArrayList<>();
        for (var item:listAnimal) {
            if(item instanceof Flyable)
                flyables.add((Flyable) item);
        }
        return flyables;
    }

    public List<Floating> floatables(){
        List<Floating> floatables = new ArrayList<>();
        for (var item:listAnimal) {
            if(item instanceof Floating)
            floatables.add((Floating) item);
        }
        return floatables;
    }

    public Walkable winnerWalk(){
        int index = 0;
        for (int i = 0; i < walkables().size(); i++){
            if(walkables().get(i).speedForWalk() > walkables().get(index).speedForWalk())
                index = i;
        }
        return walkables().get(index);
    }
    public Flyable winnerFly(){
        int index = 0;
        for (int i = 0; i < flyables().size(); i++){
            if(flyables().get(i).speedForFly() > flyables().get(index).speedForFly())
                index = i;
        }
        return flyables().get(index);
    }

    public Floating winnerFloat(){
        int index = 0;
        for (int i = 0; i < floatables().size(); i++){
            if(floatables().get(i).speedSwimming() > floatables().get(index).speedSwimming())
                index = i;
        }
        return floatables().get(index);
    }
    
}
