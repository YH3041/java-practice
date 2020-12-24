package oopChap3.inheritance;

public class Whale extends Mammals implements Swimming{
    Whale() {
        myClass = "고래";
    }

    public void swim() {
        System.out.println(myClass + "헤엄치는 중 어푸!!어푸!!");
    }
}
