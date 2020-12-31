package chap10;

public class inheritance {
    public static void main(String args[]) {
        inheritance sample = new inheritance();
        sample.callPrintName();

    }

    public void callPrintName() {

        // 모두 같은 타입으로 선언했지만, 실제 호출되는 것은 원래 객체에 있는 메소드가 호출된다. -> 다형
        Parent parent1 = new Parent();
        Parent parent2 = new Child();
        Parent parent3 = new ChildOther();

        parent1.printName();
        parent2.printName();
        parent3.printName();
    }

}
