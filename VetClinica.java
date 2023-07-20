import java.util.ArrayList;
import java.util.List;

public class VetClinica {
    private final List<Animal> animals;

    public VetClinica() {
        this.animals = new ArrayList<>();
    }

    public VetClinica addNewAnimal(Animal animal){
        animals.add(animal);
        return this;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Animal> getFlyingAnimals(){
        List<Animal> resultAnimals = new ArrayList<>();
        for (Animal animal: animals) {
            if(animal instanceof Flyable){
                resultAnimals.add(animal);
            }
        }
        return resultAnimals;
    }

    /*public List<flyable> getFlyingAnimals(){
        List<flyable> resultAnimals = new ArrayList<>();
        for (Animal animal: animals) {
            if(animal instanceof flyable){
                resultAnimals.add((flyable) animal);
            }
        }
        return resultAnimals;
    }*/

    public List<Runnable> getRaningAnimals(){
        List<Runnable> resultAnimals = new ArrayList<>();
        for (Animal animal: animals) {
            if(animal instanceof Runnable){
                resultAnimals.add((Runnable) animal);
            }
        }
        return resultAnimals;


}
public List<Swimable> getSwimingAnimals(){
        List<Swimable> resultAnimals = new ArrayList<>();
        for (Animal animal: animals) {
            if(animal instanceof Swimable){
                resultAnimals.add((Swimable) animal);
            }
        }
        return resultAnimals;
    }
}