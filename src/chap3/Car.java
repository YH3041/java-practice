package chap3;

public class Car {
    public static void main(String args[]) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.speedUp();
        car2.speedUp();
        car2.speedUp();
        car2.breakDown();

        System.out.println(car1.getCurrent());
        System.out.println(car2.getCurrent());
    }

    int speed;

    void speedUp() {
        speed += 5;
    }

    void breakDown() {
        speed -= 10;
    }

    int getCurrent() {
        return speed;
    }

}
