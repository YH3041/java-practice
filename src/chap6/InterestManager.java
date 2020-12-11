package chap6;

public class InterestManager {

    public static void main(String args[]) {
        InterestManager p1 = new InterestManager();

        System.out.println(p1.calculateAmout(365, 100));
    }

    public double getInterestRate(int day) {
        if (day >= 365) {
            return 0.056;
        } else if (day > 180 && day <= 364) {
            return 0.02;
        } else if (day > 90 && day <= 180) {
            return 0.01;
        } else {
            return 0.005;
        }
    }

    public double calculateAmout(int day, long amout) {
        return getInterestRate(day) + amout;
    }

}
