package chap12;

public class ExamInterface {
    public static void main(String args[]) {
        Door door = new Door();

        door.open();
        door.close();
        door.blue();
        door.red();
    }
}


// interface에서 몸통이 없는 메소드만 선언 가능
interface OpenCloseIf {

    public void open();
    public void close();

}

interface PaintIf {
    public void red();
    public void blue();

    // java8부터 추가된 defalue 메소드를 이용해서 인터페이스에서 구현가능
    default void pink() {
        System.out.println("door pink");
    }
}

// interface는 다중상속이 가능하다.
class Door implements OpenCloseIf, PaintIf {

    @Override
    public void open() {
        System.out.println("door open");
    }

    @Override
    public void close() {
        System.out.println("door close");
    }

    @Override
    public void red() {
        System.out.println("door red");
    }

    @Override
    public void blue() {
        System.out.println("door blue");
    }
}