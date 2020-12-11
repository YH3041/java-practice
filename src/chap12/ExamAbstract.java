package chap12;

public class ExamAbstract {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("호랑이");

        tiger.cry();
        tiger.behavior();
    }

}

// 추상클래스
abstract class Animal {
    String animalName;

    Animal(String name) {
        animalName = name;
    }

    // 추상메소드, 메소드, 멤버필드, 생성자 정의할 수 있다.
    // 추상메소드는 내용을 정의할 수 없다.
    public abstract void cry();

    public abstract void behavior();
}


class Tiger extends Animal {
    //생성자
    public Tiger(String name) {
        super(name); //name의 값을 부모클래스에 전달
    }

    @Override
    public void cry() {
        System.out.println("어흥");
    }

    @Override
    public void behavior() {
        System.out.println("움직인다.");
    }
}
