class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}
public class PromotionExample2 {    
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

        //B b3 = e;
        //C c2 = d;
    //현재 상속 파일들을 만들지 않았기때문에 실행해도 오류남
    //클래스 A의 상속되는 파일들을 구별 해보는 예
    //A > B > D(ABD)
    //A > C > E(ACE)
    }
    
}
