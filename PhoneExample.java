public class PhoneExample {
    public static void main(String[] args) {
        /*Phone phone = new Phone();은 생성되지 않음
        abstract 형으로 만들어진 클래스라서 불러오지 못함
        따라서 abstract 클래스를 
        상속 받은 클래스가 있다면 그 클래스를 활용하여
        new 객체를 만들어야함
         */
        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.trunOn();
        smartPhone.internetSearch();
        smartPhone.trunOff();
    }
}
