package OopSem4;

import java.util.ArrayList;
import java.util.List;

public class Team <T extends Warrior>{
    List<T> team = new ArrayList<>();
    public Team<T> add(T warriorT){
        team.add(warriorT);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder warriors = new StringBuilder();
        for(T itemT: team){
            warriors.append(itemT);
            warriors.append("\n");
        }
        warriors.append(String.format("heathPoint %s, damage %s, max range %s", healthPoints(), getDamage(), maxRange()));
        return warriors.toString();
    }

    public int healthPoints(){
        int sum = 0;
        for(T itemT: team){
            sum += itemT.getHealthPoint();
        }
        return sum;
    }
    public int getDamage(){
        int sum = 0;
        for(T itemT: team){
            sum += itemT.getWeapon().damage();
        }
        return sum;
    }

    public int maxRange(){
        int max = 0;
        for(T itemT: team){
            if(itemT instanceof Archer){
                if(max < ((Archer)itemT).range()){
                    max = ((Archer)itemT).range();
                }
            }
        }
        return max;
    }
}
