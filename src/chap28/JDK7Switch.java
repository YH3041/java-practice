package chap28;

public class JDK7Switch {
    public static void main(String args[]) {
        JDK7Switch sample = new JDK7Switch();
        System.out.println(sample.salaryIncreaseAmount("Engineer"));
    }
    public double salaryIncreaseAmount(String employeeLeve1) {
        switch (employeeLeve1) {
            case "CEO" :
                return 10.0;
            case "Manager" :
                return 15.0;
            case "Engineer":
                return 100.0;
            case "Designer:" :
            case "Planner" :
                return 20.0;
        }
        return 0.0;
    }
}
