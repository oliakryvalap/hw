public class Swallow extends Animal implements Soundable, Flyable{
    public Swallow(String name, String owner) {
        super(name, owner);
    }

    @Override
    public void sound() {
        System.out.println("pi-pi");
    }
    @Override
    public void fly() {
        System.out.println();
    }
}