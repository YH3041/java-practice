package oopChap3.inheritance;

public class Bat extends Bird implements Fly{
    Bat() {
        myClass = "박쥐";
    }

    @Override
    public void fly() {
        System.out.println(myClass + "나는 중. 슈웅!! 슈웅!!");
    }
}
