public class DefaultMethodExample {
    public static void main(String[] args) {
        MyInterFace mi = new MyClassA();
        mi.method1();
        mi.method2();

        MyInterFace mi1 = new MyClassB();
        mi1.method1();
        mi1.method2();
    }
}
