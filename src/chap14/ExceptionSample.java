package chap14;

import com.sun.jmx.snmp.SnmpUnknownMsgProcModelException;

public class ExceptionSample {
    public static void main(String args[]) {
        ExceptionSample sample = new ExceptionSample();
//        sample.arrayOutOfBounds();
//        sample.finallySample();
//        sample.throwable()
        try {
            sample.throwException2(12);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void throwException(int number) throws Exception {
        try {
            if(number > 12) {
                throw new Exception("Number is over than 12");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //직접 만든 예외 던지기
    public void throwException2(int number) throws MyException {
        try {
            if(number > 12) {
                throw new MyException("Number is over than 12");
            }
            //예외 이름
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public void throwable() {
        int[] intArray = new int[5];
        try {
            intArray = null;
            System.out.println(intArray[5]);
        } catch (Throwable t) {
            //getMessage() < toString() < printStackTrace()
            System.out.println(t.toString());
        }
    }

    public void arrayOutOfBounds() {
        int[] intArray = new int[5];

        try {
            System.out.println(intArray[5]);

        }catch (Exception e) {
            System.out.println("Exception occured.");
            System.out.println(intArray.length);

        }
        System.out.println("This code should run.");
    }

    public void finallySample() {
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[5]);
        } catch (Exception e) {
            System.out.println(intArray.length);
        } finally {
            System.out.println("Here is finally");
        }
        System.out.println("This code should run.");
    }

    public void multiCatch() {
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[5]);
        }catch (NullPointerException e) {
            System.out.println("NullPointerException occured");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occured");
        } catch (Exception e) {
            System.out.println(intArray.length);
        }
    }
}
