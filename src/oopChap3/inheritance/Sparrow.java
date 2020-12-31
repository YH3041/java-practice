package oopChap3.inheritance;

public class Sparrow extends Bird implements Fly{
    Sparrow() {
        myClass = "참새";
    }

    public void fly() {
        System.out.println(myClass + "나는 중. 허우적!! 허우적!!");
    }
}
