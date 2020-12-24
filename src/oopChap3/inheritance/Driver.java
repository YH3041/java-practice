package oopChap3.inheritance;

public class Driver {
    public static void main(String args[]) {
        Fly bat = new Bat();
        bat.fly();

        Fly sparrow = new Sparrow();
        sparrow.fly();

        Swimming[] mammals = new Swimming[2];

        mammals[0] = new Penguin();
        mammals[1] = new Whale();

        for (Swimming mammal : mammals) {
            mammal.swim();;
        }
    }
}
