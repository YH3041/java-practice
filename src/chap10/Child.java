package chap10;

public class Child extends Parent {
    public Child() {

    }

    //부모 클래스 오버라이
    public void printName() {
        System.out.println("PrintName() - Child");
    }
    public void printAge() {
        System.out.println("printAge() - Child");
    }
}
