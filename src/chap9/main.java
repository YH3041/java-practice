package chap9;


public class main {
    public static void main(String args[]) {
        AccessModifier acc = new AccessModifier();
        acc.publicMethod();
        acc.protectedMethod();
        acc.packagePrivateMethod();
//        acc.privateMethod(); //Error 같은 클래스 안에서만 접근가능
    }
}
