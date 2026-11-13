public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        
        Parent pa = child;

        pa.method1();
        
        pa.method2();
    }
}
