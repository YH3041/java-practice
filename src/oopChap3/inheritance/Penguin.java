package oopChap3.inheritance;

public class Penguin extends Mammals implements Swimming{
    Penguin() {
        myClass = "펭귄";
    }

    public void swim() {
        System.out.println(myClass + "헤엄치는 중 어푸!!어푸!!");
    }
}
