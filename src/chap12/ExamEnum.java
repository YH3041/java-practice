package chap12;


//enum 상수 선언
public enum ExamEnum {
    THREE_HOUR,
    FIVE_HOUR,
    WEEKEND_FOUR_HOUR,
    WEEKEND_EIGHT_HOUR
}

//enum 상수 선언 및 초기화
enum ExamEnum2 {
    THREE_HOUR(18000),
    FIVE_HOUR(30000),
    WEEKEND_FOUR_HOUR(40000),
    WEEKEND_EIGHT_HOUR(60000);
    private final int amount;

    ExamEnum2(int amount) {
        this.amount = amount;
    }

    public int  getAmount() {
        return amount;
    }

}


