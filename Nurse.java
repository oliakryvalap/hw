import java.util.ArrayList;
import java.util.List;

public class Nurse {
 
 
    private final List<Animal> animals;

    public Nurse() {
        this.animals = new ArrayList<>();
    }

    public Nurse addNewAnimal(Animal animal){
        animals.add(animal);
        return this;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Animal> getIllableAnimals(){
        List<Animal> resultAnimals = new ArrayList<>();
        for (Animal animal: animals) {
            if(animal instanceof Flyable){
                resultAnimals.add(animal);
            }
        }
        return resultAnimals;
    }

   

}   
   

