import java.util.ArrayList;
import java.util.List;

public class Doctor {
 
    private final List<Human> humans;

    public Doctor() {
        this.humans = new ArrayList<>();
    }

    public Doctor addNewHuman(Human human){
        humans.add(human);
        return this;
    }

    public List<Human> getHumans() {
        return humans;
    }

    public List<Human> getIllableHumans(){
        List<Human> resultHumans = new ArrayList<>();
        for (Human human: humans) {
            if(human instanceof Flyable){
                resultHumans.add(human);
            }
        }
        return resultHumans;
    }

   

}   

