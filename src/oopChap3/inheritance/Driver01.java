package oopChap3.inheritance;

public class Driver01 {
    public static void main(String args[]) {
        Animal animal = new Animal();
        Mammals mammals = new Mammals();
        Bird bird = new Bird();
        Whale whale = new Whale();
        Bat bat = new Bat();
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        animal.showMe();
        mammals.showMe();
        bird.showMe();
        whale.showMe();
        bat.showMe();
        sparrow.showMe();
        penguin.showMe();
    }
}
