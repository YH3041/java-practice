package chap11;

public class InheritanceObject {
    public static void main(String args[]) {
        InheritanceObject obj = new InheritanceObject();
        obj.toStringMethod(obj);
    }
    //toString 오버라이딩
    public String toString() {
        return "InheritanceObject class";
    }

    public void toStringMethod(InheritanceObject obj) {
        System.out.println(this);
        System.out.println(toString());
        System.out.println("plus " + this);
    }
}
