package package1;

public class B2 {
    public B2(){
        A2 a = new A2();
        a.field1 = 1;
        a.field2 = 1;
        //a.field3 - 1; private기 때문에 인식못함

        a.method1();
        a.method2();
        //a.method3(); 마찬가지로 private 처리했기때문에 인식못함.
    }
}
