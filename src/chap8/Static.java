package chap8;

public class Static {
    String name = "Hello";
    public static void main(String args[]) {
        Static.staticMethod(); //Static 메소드는 객체를 생성하지 않고 바로 호출가능
    }

    static void staticMethod() {
        System.out.println("This is Static Method");
//      System.out.println(name); Static 메소드는 class 변수만 호출가능

    }
}
