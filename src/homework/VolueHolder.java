package homework;

public class VolueHolder {
    private Integer value = 0;

    public static void main(String args[]) {

    }

    // value가 50보다 큰지 체크
    public synchronized boolean hasNext() {
        return value < 50;
    }

    //value가 50과 같으면 RuntimeException 던진다. 아니면 value++
    public synchronized Integer next() {
            if (value == 50) {
                throw new RuntimeException();
            } else
                return value++;
    }

    //Integer 값 리턴
    public Integer getValue() {
        return value;
    }


}