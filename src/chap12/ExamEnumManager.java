package chap12;

public class ExamEnumManager {
    public static void main(String args[]) {
//        ExamEnumManager manager = new ExamEnumManager();
//        int myAmount = manager.getEnum(ExamEnum.FIVE_HOUR);
//        System.out.println(myAmount);

//        ExamEnum2 value = ExamEnum2.WEEKEND_EIGHT_HOUR;
//        System.out.println(value);
//        System.out.println(value.getAmount());

        //values를 이용한 호출
        ExamEnum2[] valueList = ExamEnum2.values();
        for (ExamEnum2 value : valueList) {
            System.out.println(value);
        }
    }

    //switch를 이용한 enum
    public int getEnum(ExamEnum time) {
        int amount = 0;
        System.out.println(time);
        switch (time) {
            case THREE_HOUR:
                amount = 18000;
                break;
            case FIVE_HOUR:
                amount = 30000;
                break;
            case WEEKEND_FOUR_HOUR:
                amount = 40000;
                break;
            case WEEKEND_EIGHT_HOUR:
                amount = 60000;
                break;
        }
        return amount;
    }
}
