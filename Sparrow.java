public class Sparrow extends Animal implements Soundable, Flyable{
    public Sparrow(String name, String owner) {
        super(name, owner);
    }

    @Override
    public void sound() {
        System.out.println("chik-chirik");
    }
    @Override
    public void fly() {
        System.out.println();
    }
}